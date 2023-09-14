package com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.impl;

import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.Infantry;
import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.MiddleEarthUnit;

public class InfantryHuman extends AbstructUnit implements MiddleEarthUnit, Infantry {
    public InfantryHuman(String name) {
        super(name, 7, 8 );
    }
}
