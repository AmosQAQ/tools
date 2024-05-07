package com.example.demojackson.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Pattern;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 验证账号
 */
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {})
@Pattern(regexp = "^.{1,20}$")
@ReportAsSingleViolation
public @interface Account {

    String message() default "账号格式不正确,中文、数字、英文,不超过20个字";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
