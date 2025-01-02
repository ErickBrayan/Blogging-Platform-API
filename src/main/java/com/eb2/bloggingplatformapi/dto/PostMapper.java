package com.eb2.bloggingplatformapi.dto;

import com.eb2.bloggingplatformapi.entities.Post;

public class PostMapper {

    public static Post toEntity (PostDTO postDTO) {
        Post post = new Post();
        post.setTitle(postDTO.title());
        post.setCategory(postDTO.category());
        post.setContent(postDTO.content());
        post.setTags(postDTO.tags());

        return post;
    }
}
