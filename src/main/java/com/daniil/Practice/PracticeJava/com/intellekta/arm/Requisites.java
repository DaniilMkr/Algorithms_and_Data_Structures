package com.daniil.Practice.PracticeJava.com.intellekta.arm;

import java.io.Serializable;

public class Requisites implements Serializable {
    private String name;
    private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
