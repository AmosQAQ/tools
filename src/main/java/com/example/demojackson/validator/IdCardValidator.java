package com.example.demojackson.validator;

import cn.hutool.core.lang.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IdCardValidator implements ConstraintValidator<IdCard, String> {

    @Override
    public void initialize(IdCard constraintAnnotation) {
    }

    @Override
    public boolean isValid(String idCard, ConstraintValidatorContext context) {
        if (idCard == null || idCard.length() == 0) {
            return true;
        }
        return Validator.isCitizenId(idCard);
    }
}
