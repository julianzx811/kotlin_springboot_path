package com.usb.SpringMVC100.domain;

import com.usb.SpringMVC100.domain.Coment;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Post {
  private Integer id;
  @NotNull
  @Size(min = 3, max = 50,
        message =
            "Title must be minimum 3characters, and maximum 50 characters long")
  private String title;
  @NotNull
  @Size(
      min = 3, max = 500,
      message =
          "Description must be minimum 3characters, and maximum 500 characters long")
  private String description;
  @NotNull
  @Size(
      min = 3, max = 5000,
      message =
          "Body must be minimum 3characters, and maximum 5000 characters long")
  private String body;
  private String slug;
  private PostStatus postStatus;
  private LocalDateTime createdOn;
  private LocalDateTime updatedOn;
  private List<Coment> comments;
}
