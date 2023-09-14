package com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.impl;

import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.Cavalry;
import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.MordorUnit;

public class CavalryOrc extends AbstractCavalryUnit implements MordorUnit, Cavalry {

    public CavalryOrc(String name) {
        super(name, 8, 10);
        setBeast(this.new Warg());
    }
}