package com.eblog.demo.domain;

import com.eblog.demo.entity.Post;
import com.eblog.demo.entity.User;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
  List<Post> findAllByUser(User user);

Page<Post> findByUserEmail(String email, Pageable pageable);
}
