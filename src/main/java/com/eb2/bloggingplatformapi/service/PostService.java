package com.eb2.bloggingplatformapi.service;

import com.eb2.bloggingplatformapi.dto.PostDTO;
import com.eb2.bloggingplatformapi.entities.Post;

import java.util.List;

public interface PostService {

    List<Post> getAllPost(String term);
    Post getPostById(Long id);
    Post createPost(PostDTO postDTO);
    Post updatePost(PostDTO postDTO, Long id);
    void deletePost(Long id);

}
