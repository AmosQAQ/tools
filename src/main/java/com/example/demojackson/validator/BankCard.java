package com.example.demojackson.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Pattern;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 验证银行卡号是否正确
 */
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {})
@Pattern(regexp = "^\\d{16,19}$")
public @interface BankCard {

    String message() default "银行卡号格式不正确，16至19位数字";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
