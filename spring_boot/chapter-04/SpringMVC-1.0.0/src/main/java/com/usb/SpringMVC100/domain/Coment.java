package com.usb.SpringMVC100.domain;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Coment {
  private Integer id;
  @NotNull
  @Size(min = 3, max = 50, message = "tittle must be at least 3 caracthers")
  private String title;
  @NotNull private String authorname;
  @NotNull
  @Size(min = 3, max = 100, message = "body must be at least 3 caracthers")
  private String body;
  private LocalDateTime createdOn;
  private LocalDateTime updatedOn;
}
