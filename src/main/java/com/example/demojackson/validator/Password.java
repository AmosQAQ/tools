package com.example.demojackson.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Pattern;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 验证密码
 */
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {})
@Pattern(regexp = "^[a-zA-Z0-9]{6,15}$")
public @interface Password {

    String message() default "密码格式不正确,6-15位，数字，字母不限";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
