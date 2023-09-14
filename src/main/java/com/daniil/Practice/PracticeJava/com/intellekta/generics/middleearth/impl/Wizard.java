package com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.impl;

import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.Cavalry;
import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.MiddleEarthUnit;
import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.Unit;

public class Wizard extends AbstractCavalryUnit implements MiddleEarthUnit, Unit, Cavalry {
    public Wizard(String name) {
        super(name, 20, 21);
        setBeast(this.new Horse());
    }
}
