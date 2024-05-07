package com.example.demojackson.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Pattern;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 验证企业名称
 */
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {})
@Pattern(regexp = "^.{1,30}$")
public @interface EnterpriseName {

    String message() default "企业名称格式不正确,不超过30个字符";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
