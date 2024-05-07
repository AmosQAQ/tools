package com.example.demojackson.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 验证手机验证码
 */
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = SmsCodeValidator.class)
public @interface SmsCode {

    String accountField() default "account";

    String smsCodeField() default "smsCode";

    String message() default "验证码不正确";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
