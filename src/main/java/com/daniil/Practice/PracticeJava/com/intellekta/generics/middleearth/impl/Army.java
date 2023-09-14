package com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.impl;

import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Army <T extends Unit> implements MordorUnit, MiddleEarthUnit {

    private ArrayList<Infantry> infantries = new ArrayList<>();
    private ArrayList<Cavalry> cavalry = new ArrayList<>();
    private int size;
    private ArrayList<T> armyList = new ArrayList<>(size);


    public ArrayList<Cavalry> getCavalry() {
        if (cavalry == null) {
            cavalry = new ArrayList<>();
        }
        return cavalry;
    }

    public ArrayList<Infantry> getInfantry() {
        if (infantries == null) {
            infantries = new ArrayList<>();
        }
        return infantries;
    }

    public void getArmy() {
        armyList.sort(Comparator.comparing(cavalry -> cavalry.getClass().getName()));
    }

    public ArrayList<T> getArmyList() {
        return armyList;
    }

    public int getSize() {
        return armyList.size();
    }

    public void setSize(int size) {
        this.size = size;
    }

    public AbstructUnit getLast() {
        return (AbstructUnit) armyList.get(armyList.size() - 1);
    }


    public boolean recruit(T unit) {
        if (unit instanceof Cavalry) {
                armyList.add(unit);
                cavalry.add((Cavalry) unit);
                return true;
        } else if (unit instanceof Infantry) {
                armyList.add(unit);
                infantries.add((Infantry) unit);
                return true;
            }
        return false;
    }

    public void print() {
        getArmy();
        for (T cavalry : armyList) {
            System.out.println(cavalry.toString() + "\n");
        }
    }

    public boolean release(T unit) {
            for (int i = 0; i < armyList.size(); i++) {
                if (armyList.get(i) instanceof Cavalry && unit instanceof Cavalry) {
                    armyList.remove(i);
                    cavalry.remove(unit);
                    return true;
                } else if (armyList.get(i) instanceof Infantry && unit instanceof Infantry) {
                    armyList.remove(i);
                    infantries.remove(unit);
                    return true;
                }
            }
        return false;
    }

    public T getRandomUnit() {
        for (int i = 0; i < armyList.size(); i++) {
            if (new Random().nextInt() == i) {
                if (armyList.get(i) instanceof Cavalry) {
                    return armyList.get(i);
                } else if (armyList.get(i) instanceof Infantry) {
                    return armyList.get(i);
                }
            }
        }
        return null;
    }

    public T getRandomUnit(T unit) {
        for (int i = 0; i < armyList.size(); i++) {
            if (new Random().nextInt() == i) {
                if (armyList.get(i) instanceof Cavalry && unit instanceof Cavalry) {
                    return armyList.get(i);
                } else if (armyList.get(i) instanceof Infantry && unit instanceof Infantry) {
                    return armyList.get(i);
                }
            }
        }
        return null;
    }
}

