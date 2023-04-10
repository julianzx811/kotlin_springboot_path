package com.usb.SpringMVC100.repositories;

import com.usb.SpringMVC100.domain.Post;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.springframework.stereotype.Repository;

@Repository
public class PostRepository {
  private final Set<Post> posts = new CopyOnWriteArraySet<>();

  public void addPost(Post post) {
    posts.add(post);
  }

  public Set<Post> findAllPosts() {
    return posts;
  }
}
