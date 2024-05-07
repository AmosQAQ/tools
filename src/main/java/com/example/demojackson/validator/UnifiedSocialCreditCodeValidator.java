package com.example.demojackson.validator;

import cn.hutool.core.lang.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UnifiedSocialCreditCodeValidator implements ConstraintValidator<UnifiedSocialCreditCode, String> {
    @Override
    public void initialize(UnifiedSocialCreditCode constraintAnnotation) {
    }

    @Override
    public boolean isValid(String unifiedSocialCreditCode, ConstraintValidatorContext context) {
        if (unifiedSocialCreditCode == null || unifiedSocialCreditCode.length() == 0) {
            return true;
        }
        return Validator.isCreditCode(unifiedSocialCreditCode);
    }
}
