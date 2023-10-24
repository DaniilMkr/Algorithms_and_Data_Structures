package com.daniil.Practice.PracticeJava.com.intellekta.spring.articleSite;

import org.springframework.stereotype.Component;

@Component

public class Developer {
    private String name;
    private String specialization;
    private String experience;

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getExperience() {
        return experience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Developer:" +
                " Name: " + getName() +
                " Specialization: " + getSpecialization() +
                " Experience: " + getExperience();
    }
}
