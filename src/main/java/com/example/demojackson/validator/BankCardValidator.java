package com.example.demojackson.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class BankCardValidator implements ConstraintValidator<BankCard, String> {

    private static final Pattern BANK_CARD_NUMBER_PATTERN = Pattern.compile("^\\d{15,19}$");

    @Override
    public void initialize(BankCard constraintAnnotation) {
    }

    @Override
    public boolean isValid(String bankCardNumber, ConstraintValidatorContext context) {
        if (bankCardNumber == null || bankCardNumber.length() == 0) {
            return true;
        }
        return BANK_CARD_NUMBER_PATTERN.matcher(bankCardNumber).matches();
    }
}
