package com.daniil.Practice.PracticeJava.com.intellekta.spring.users;

import org.springframework.core.convert.converter.Converter;


public class UserFactory implements Converter<String, User> {


    @Override
    public User convert(String source) {
        String[] data = source.split(",");
        String name = null;
        Integer age = null;
        String email = null;
        for (String datum : data) {
            if (datum.matches("^[a-zA-Z]")) name = datum;
            else if (datum.matches("^\\d")) age = Integer.valueOf(datum);
            else if (datum.matches("^[a-zA-Z] + @")) email = datum;
        }
        return new User(name, age, email);
    }

}
