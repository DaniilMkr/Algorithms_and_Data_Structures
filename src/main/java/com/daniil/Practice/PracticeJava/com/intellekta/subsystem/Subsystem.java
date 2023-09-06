package com.daniil.Practice.PracticeJava.com.intellekta.subsystem;

public interface Subsystem {

    String getName();
    int getVersion();
    void install();
    Subsystem[] getPrerequisites();

}
