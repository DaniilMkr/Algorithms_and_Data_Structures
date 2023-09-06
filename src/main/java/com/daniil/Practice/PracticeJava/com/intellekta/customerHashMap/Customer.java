package com.daniil.Practice.PracticeJava.com.intellekta.customerHashMap;

import java.util.HashMap;
import java.util.Map;

public class Customer {
    private int id;
    private String name;
    private String phone;
    private int purchaseCount;

    public static Map<Integer, Customer> load(Customer[] customers) {
        Map<Integer, Customer> map = null;
        for(int i = 0; i < customers.length; i++) {
            map = new HashMap<>();
            map.put(i, customers[i]);
        }
        return map;
    }

    public static Customer getById(int id) {
        Map<Integer, Customer> map = load(new Customer[]{});
        for (Map.Entry <Integer, Customer> entry : map.entrySet()) {
            if (entry.getKey().equals(id)) {
                return entry.getValue();
            }
        }
        return null;
    }
}
