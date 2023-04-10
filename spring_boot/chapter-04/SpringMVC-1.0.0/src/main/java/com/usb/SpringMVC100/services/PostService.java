package com.usb.SpringMVC100.services;

import com.usb.SpringMVC100.domain.*;
import com.usb.SpringMVC100.repositories.*;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

  public final PostRepository postRepository;

  public void addPost(Post post) {
    postRepository.addPost(post);
  }

  public Set<Post> findallpost() {
    return postRepository.findAllPosts();
  }
}
