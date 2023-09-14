package com.daniil.Practice.PracticeJava.com.intellekta.arm;

import java.io.Serializable;

public class Clients implements Serializable {

    private String name;
    private ContactPerson contactPerson;
    private Requisites requisites;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContactPerson getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(ContactPerson contactPerson) {
        this.contactPerson = contactPerson;
    }

    public Requisites getRequisites() {
        return requisites;
    }

    public void setRequisites(Requisites requisites) {
        this.requisites = requisites;
    }

}
