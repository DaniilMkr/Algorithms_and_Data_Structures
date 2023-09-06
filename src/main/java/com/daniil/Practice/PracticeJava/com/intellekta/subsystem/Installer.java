package com.daniil.Practice.PracticeJava.com.intellekta.subsystem;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Installer implements Subsystem {
    private String name;
    private int version;
    private Subsystem[] prerequisites;
    private Queue<Subsystem> subsystems;
    private static int count = -1;


    public Installer(String name, int version) {
        this.name = name;
        this.version = version;
    }


    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getVersion() {
        return version;
    }

    @Override
    public void install() {
        System.out.println(this.getName() + " version " + this.getVersion() + " installed successfully ");
    }

    @Override
    public Subsystem[] getPrerequisites() {
        if (count < prerequisites.length - 1) {
            count = count + 1;
            return new Subsystem[]{prerequisites[count]};
        }
        return new Subsystem[0];
    }

    public Queue<Subsystem> setUpPlan() {
        subsystems = new ArrayBlockingQueue<>(10);
        prerequisites = new Subsystem[10];
        if (checkForSameName()) {
            int count = 0;
            while (count < prerequisites.length) {
                subsystems.add(getPrerequisites()[0]);
                count++;
            }
            return subsystems;
        }
        return new ArrayBlockingQueue<>(10);
    }

    public void setUp(Queue<Subsystem> subsystems){
        if (subsystems.isEmpty()) {
            return;
        }
        Subsystem subsystem = subsystems.peek();
        subsystem.install();
        subsystems.remove();
        setUp(subsystems);
    }

    public boolean checkForSameName() {
        for (int i = 0; i < prerequisites.length; i++) {
            if (prerequisites[i].getName() == null) {
                System.out.println("SetUp plan calculation failed. Wrong prerequisite description at " +
                        "" + prerequisites[i].getName() + " " + prerequisites[i].getVersion());
                return false;
            }
            for (int j = i + 1; j < prerequisites.length; j++) {
                if (prerequisites[j].getName() == null || prerequisites[i] == prerequisites[j]) {
                    System.out.println("SetUp plan calculation failed. Wrong prerequisite description at " +
                            "" + prerequisites[j].getName() + " " + prerequisites[j].getVersion());
                    return false;
                }
                else {
                    if (prerequisites[i].getName().equals(prerequisites[j].getName())
                            && prerequisites[i].getVersion() > prerequisites[j].getVersion()) {
                        Subsystem temp = prerequisites[i];
                        prerequisites[i] = prerequisites[j];
                        prerequisites[j] = temp;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
