package com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.impl;

import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.Infantry;
import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.MordorUnit;

public class InfantryOrc extends AbstructUnit implements MordorUnit, Infantry {
    public InfantryOrc(String name) {
        super(name, 8, 10);
    }
}
