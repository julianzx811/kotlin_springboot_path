package com.usb.SpringMVC100.validations;

import com.usb.SpringMVC100.validations.BlogPostTitleValidator;
import jakarta.validation.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = BlogPostTitleValidator.class)
public @interface BlogPostTitleAlreadyExists {
  String message() default "tittle alredy exist";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
