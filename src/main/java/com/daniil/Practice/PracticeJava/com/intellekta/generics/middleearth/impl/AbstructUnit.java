package com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.impl;

import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.Infantry;
import java.util.Random;

public class AbstructUnit implements Infantry {
    private String name;
    private int power;

    public AbstructUnit(String name, int minPower, int maxPower) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            this.name = super.toString();
        }
        else this.name = name;
        this.power = new Random().nextInt(minPower, maxPower);
    }

    public AbstructUnit(int minPower, int maxPower) {
        this.power = new Random().nextInt(minPower, maxPower);
    }

    public <T extends AbstructUnit> void strike(T unit) {
        if (unit.isAlive()) {
            unit.getDamage(this.power);
        }
    }

    public boolean isAlive() {
        return power > 0;
    }

    public int getDamage(int damage) {
        return this.power = AbstructUnit.this.power - damage;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " has power " + this.power;
    }
}
