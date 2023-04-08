package com.usb.SpringMVC100.domain;

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
  private String title;
  private String authorname;
  private String body;
  private LocalDateTime createdOn;
  private LocalDateTime updatedOn;
}
