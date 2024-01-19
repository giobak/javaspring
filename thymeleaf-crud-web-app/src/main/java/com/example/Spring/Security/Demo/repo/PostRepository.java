package com.example.Spring.Security.Demo.repo;

import com.example.Spring.Security.Demo.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
