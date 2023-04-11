package com.usb.SpringMVC100.validations;

import com.usb.SpringMVC100.domain.Post;
import com.usb.SpringMVC100.services.PostService;
import io.micrometer.common.util.StringUtils;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public record BlogPostTitleValidator(PostService postService)
    implements ConstraintValidator<BlogPostTitleAlreadyExists, Post> {
  @Override
  public void initialize(BlogPostTitleAlreadyExists constraintAnnotation) {
    ConstraintValidator.super.initialize(constraintAnnotation);
  }

  @Override
  public boolean isValid(
      Post post, ConstraintValidatorContext constraintValidatorContext) {
    if (!StringUtils.isEmpty(post.getTitle()) &&
        postService.postExistsWithTitle(post.getTitle())) {
      constraintValidatorContext.disableDefaultConstraintViolation();
      constraintValidatorContext
          .buildConstraintViolationWithTemplate("Title Already Exists")
          .addPropertyNode("title")
          .addConstraintViolation();
      return false;
    }
    return true;
  }
}
