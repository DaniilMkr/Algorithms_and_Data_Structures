package com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.impl;

import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.Cavalry;
import java.util.Random;

public class AbstractCavalryUnit <T> extends AbstructUnit implements Cavalry {

    private String name;

    private int power;

    private T beast;

    public int getPower() {
        return power;
    }

    public AbstractCavalryUnit(String name , int minPower, int maxPower) {
        super(name, minPower, maxPower);
    }

    public AbstructUnit getBeast() {
        return (AbstructUnit) beast;
    }

    public void setBeast(T beast) {
        this.beast = beast;
    }

    public int getDamage(int damage) {
        return this.power = AbstractCavalryUnit.this.power - damage;
    }

    public boolean isAlive() {
        return power > 0;
    }


    public <T extends AbstractCavalryUnit> void strike(T beast) {
        if ((((AbstractCavalryUnit<?>)beast).getBeast().isAlive())) {
            getBeast().getDamage(power);
        }
        else {
            beast.getDamage(power);
        }
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
