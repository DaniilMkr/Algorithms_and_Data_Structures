package com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.impl;

import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.Cavalry;
import java.util.Random;

public class AbstractCavalryUnit <T extends AbstructUnit> implements Cavalry {

    private String name;
    private T beast;
    private int power;

    public AbstractCavalryUnit(String name ,int minPower, int maxPower) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            this.name = super.toString();
        }
        else this.name = name;
        this.power = new Random().nextInt(minPower, maxPower);

    }

    public T getBeast() {
        return beast;
    }

    public void setBeast(T beast) {
        this.beast = beast;
    }

    public <T extends AbstractCavalryUnit> void strike(T beast) {
        if (beast.getBeast().isAlive()) {
            beast.getBeast().getDamage(power);
        }
        else {
            if (beast.isAlive()) {
                beast.getDamage(power);
            }
        }
    }
    public int getDamage(int damage) {
        return this.power = AbstractCavalryUnit.this.power - damage;
    }
    public boolean isAlive() {
        return power > 0;
    }
    public class Horse extends AbstructUnit {
        public Horse() {
            super(4, 5);
        }
    }
    public class Warg extends AbstructUnit {
        public Warg() {
            super(4, 7);
        }
    }
}
