package com.usb.SpringMVC100.controllers;

import com.usb.SpringMVC100.domain.Post;
import com.usb.SpringMVC100.services.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

  private final PostService postService;

  @GetMapping
  public String postPage(Model model) {
    model.addAttribute("posts", postService.findallpost());
    return "post";
  }

  @GetMapping("/add")
  public String addPostPage(Model model) {
    model.addAttribute("post", new Post());
    return "addPost";
  }

  @PostMapping
  public String addPost(@ModelAttribute("post") @Valid Post post,
                        Errors errors) {
    if (errors.hasErrors()) {
      return "addPost";
    }
    postService.addPost(post);
    return "redirect:/posts";
  }
}
