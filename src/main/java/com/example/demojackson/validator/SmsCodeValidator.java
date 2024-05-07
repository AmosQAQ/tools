package com.example.demojackson.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Field;
import java.util.Objects;

public class SmsCodeValidator implements ConstraintValidator<SmsCode, Object> {

    private String smsCodeField;
    private String accountField;

    @Override
    public void initialize(SmsCode smsCode) {
        // 获取account字段名
        this.smsCodeField = smsCode.smsCodeField();
        this.accountField = smsCode.accountField();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        Field[] declaredFields = value.getClass().getDeclaredFields();
        String smsCode = null;
        String account = null;
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            if (Objects.equals(declaredField.getName(), smsCodeField)) {
                try {
                    smsCode = (String) declaredField.get(value);
                } catch (IllegalAccessException ignore) {
                }
            }

            if (Objects.equals(declaredField.getName(), accountField)) {
                try {
                    account = (String) declaredField.get(value);
                } catch (IllegalAccessException ignore) {
                }
            }
        }
        if (Objects.isNull(smsCode) || Objects.isNull(account)) {
            return true;
        }
        context.disableDefaultConstraintViolation(); // 禁用默认的错误信息
        context.buildConstraintViolationWithTemplate("验证码不正确")
                .addPropertyNode(smsCodeField) // 指定产生错误的字段
                .addConstraintViolation();
        // 判断smsCode是否与account的值相等
        return Objects.equals(smsCode, "111");
    }
}
