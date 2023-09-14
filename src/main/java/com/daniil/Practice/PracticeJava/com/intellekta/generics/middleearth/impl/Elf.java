package com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.impl;

import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.Infantry;
import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.MiddleEarthUnit;
import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.Unit;

public class Elf extends AbstructUnit implements Unit, MiddleEarthUnit, Infantry {

    public Elf(String name) {
        super(name,4,7);
    }
}