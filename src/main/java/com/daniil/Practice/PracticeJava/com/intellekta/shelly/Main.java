package com.daniil.Practice.PracticeJava.com.intellekta.shelly;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        Consumer consumer1 = new Consumer();

        List<Consumer> list = new ArrayList<>();
        list.add(consumer);
        list.add(consumer1);

        Consumer consumer2 = new Consumer();
        Consumer consumer3 = new Consumer();

        List<Consumer> list1 = new ArrayList<>();
        list1.add(consumer2);
        list1.add(consumer3);

        List<Consumer>[] consumers = new List[2];
        consumers[0] = list;
        consumers[1] = list1;

        Consumers consumers1 = new Consumers(consumers);
        List<Consumer> consumers2 = consumers1.getConsumers();
        System.out.println(consumers2);

    }
}
