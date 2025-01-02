package com.eb2.bloggingplatformapi.repository;

import com.eb2.bloggingplatformapi.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
