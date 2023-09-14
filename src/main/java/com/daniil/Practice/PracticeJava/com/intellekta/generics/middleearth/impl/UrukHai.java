package com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.impl;

import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.Infantry;
import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.MordorUnit;
import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.Orc;
import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.Unit;

public class UrukHai extends AbstructUnit implements Unit, MordorUnit, Orc, Infantry {

    public UrukHai(String name) {
        super(name, 10, 12);
    }
}
