package com.daniil.Practice.PracticeJava.com.intellekta.shelly;

import java.util.*;

public class Consumers {

    private List<Consumer> consumers = new ArrayList<>();

    public Consumers() {
    }

    public Consumers(List<Consumer>[] lists) {
    }

    public void addConsumer(Consumer consumer) {
        consumers.add(consumer);
    }

    public List<Consumer> getConsumers() {
        Set<Consumer> setConsumers = new HashSet<>(consumers);
        return setConsumers.stream().toList();
    }
}
