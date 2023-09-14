package com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.impl;

import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.Cavalry;
import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.MiddleEarthUnit;

public class CavalryHuman extends AbstractCavalryUnit implements MiddleEarthUnit, Cavalry {

    public CavalryHuman(String name) {
        super(name, 7, 8 );
        setBeast(this.new Horse());
    }
}
