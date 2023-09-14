package com.daniil.Practice.PracticeJava.com.intellekta.shelly;

import java.util.*;

public class Consumers {
    private Set<Consumer> setConsumers = new HashSet<>();

    public Consumers() {
    }

    public Consumers(List<Consumer>[] lists) {
        for (List<Consumer> consumers : lists) {
            for (Consumer consumer : consumers) {
                addConsumer(consumer);
            }
        }
    }

    public void addConsumer(Consumer consumer) {
        setConsumers.add(consumer);
    }

    public List<Consumer> getConsumers() {
        return new ArrayList<>(setConsumers);
    }
}
