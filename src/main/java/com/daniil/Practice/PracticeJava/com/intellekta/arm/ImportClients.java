package com.daniil.Practice.PracticeJava.com.intellekta.arm;

import java.io.*;
import java.util.ArrayList;

public class ImportClients {

    private final static String PATH = "client.out";
    private static ArrayList<Clients> clientsArrayList = new ArrayList<>();

    public static ArrayList<Clients> cardsToClients(String path) {

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
            Clients clients = (Clients) objectInputStream.readObject();
            clientsArrayList.add(clients);
            objectInputStream.close();

        } catch (Exception e) {
            new ArrayList<>();
        }
        return clientsArrayList;
    }

    public static void checkImport(ArrayList<Clients> clientsArray) {
        if (clientsArray == null) {
            throw new RuntimeException("Import failed");
        }
        for (Clients clients : clientsArray) {
            System.out.println(clients.getName() + " " + clients.getContactPerson()
                    + " " + clients.getRequisites().getName() + " " + clients.getRequisites().getName());
        }
    }
}












//
//    public static void cardsFromClients(String path) {
//        try {
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
//            Clients clients = new Clients();
//            ContactPerson contactPerson = new ContactPerson();
//            Requisites pre = new Requisites();
//            pre.setValue(1);
//            pre.setName("Preq12");
//            contactPerson.setEmail("dsdsa@xi");
//            contactPerson.setPhone("23434454");
//            contactPerson.setName("My contact");
//            clients.setName("Dan");
//            clients.setContactPerson(contactPerson);
//            clients.setRequisites(pre);
//            objectOutputStream.writeObject(clients);
//        } catch (IOException ex) {
//            throw new RuntimeException(ex);
//        }
//    }

