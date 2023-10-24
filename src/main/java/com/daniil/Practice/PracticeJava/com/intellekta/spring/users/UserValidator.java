package com.daniil.Practice.PracticeJava.com.intellekta.spring.users;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component("userValidator")
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        if (supports(User.class)) {
            User user = (User)target;
            if (user.getAge() <= 0) {
                errors.rejectValue("age", "negative or zero");
            }
            else if (user.getName() == null) {
                errors.rejectValue("name", "null");
            }
            else if (user.getAge() == null) {
                errors.rejectValue("age", "null");
            }
            else if (user.getEmail() == null) {
                errors.rejectValue("email", "null");
            }
            ValidationUtils.rejectIfEmptyOrWhitespace(errors,"name" ,"name.empty" );
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", "age.empty");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "email.empty");
        }
    }
}
