package com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.impl;

import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.Infantry;
import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.MiddleEarthUnit;
import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.Unit;

public class WoodenElf extends AbstructUnit implements MiddleEarthUnit, Unit, Infantry {

    public WoodenElf(String name) {
        super(name, 6, 7);
    }
}
