package com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.impl;

import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.Cavalry;
import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.Human;
import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.MiddleEarthUnit;
import com.daniil.Practice.PracticeJava.com.intellekta.generics.middleearth.Unit;

public class Rohhirim extends AbstractCavalryUnit implements MiddleEarthUnit, Human, Unit, Cavalry {

    public Rohhirim(String name){
        super(name ,7, 8);
        setBeast(this.new Horse());
    }
}
