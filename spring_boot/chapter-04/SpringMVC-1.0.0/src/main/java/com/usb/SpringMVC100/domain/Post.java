package com.usb.SpringMVC100.domain;

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
  private String Title;
  private String Description;
  private String Body;
  private String Slug;
  private PostStatus postStatus;
  private List<Coment> coments;
}
