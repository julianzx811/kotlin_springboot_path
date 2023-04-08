package com.usb.SpringMVC100.controllers;

import com.usb.SpringMVC100.domain.Post;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
public class PostController {
  @GetMapping
  public String postPage(Model model) {
    Post post = new Post();
    post.setTitle("Hello Spring Boot");
    post.setDescription("Spring Boot");
    post.setBody("Spring Boot is Awesome");
    Post post1 = new Post();
    post1.setTitle("Hello Spring Boot 3");
    post1.setDescription("Spring Boot 3");
    post1.setBody("Spring Boot 3 is Awesome");
    model.addAttribute("posts", Arrays.asList(post, post1));
    return "post";
  }
}
