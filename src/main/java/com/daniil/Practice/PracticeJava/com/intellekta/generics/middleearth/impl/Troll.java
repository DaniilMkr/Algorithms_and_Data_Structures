package com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.impl;

import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.Infantry;
import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.MordorUnit;
import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.Unit;

public class Troll extends AbstructUnit implements MordorUnit, Unit, Infantry {

    public Troll(String name) {
        super(name, 11, 15);
    }
}
