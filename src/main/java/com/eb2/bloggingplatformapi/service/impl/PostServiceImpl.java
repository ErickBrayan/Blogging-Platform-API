package com.eb2.bloggingplatformapi.service.impl;

import ch.qos.logback.core.util.StringUtil;
import com.eb2.bloggingplatformapi.dto.PostDTO;
import com.eb2.bloggingplatformapi.dto.PostMapper;
import com.eb2.bloggingplatformapi.entities.Post;
import com.eb2.bloggingplatformapi.exception.NotFoundException;
import com.eb2.bloggingplatformapi.repository.PostRepository;
import com.eb2.bloggingplatformapi.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> getAllPost(String term) {
        if (StringUtil.isNullOrEmpty(term)) {
            return postRepository.findAll();
        }else {
            List<Post> listPost = postRepository.findAll();
            return listPost.stream().filter(post -> post.getTitle().contains(term))
                    .filter(post -> post.getTitle().contains(term))
                    .filter(post -> post.getTitle().contains(term))
                    .toList();
        }
    }

    @Override
    public Post getPostById(Long id) {
        return postRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("No post found with id: " + id, "404", HttpStatus.NOT_FOUND));
    }

    @Override
    public Post createPost(PostDTO postDTO) {
        return postRepository.save(PostMapper.toEntity(postDTO));
    }

    @Override
    public Post updatePost(PostDTO postDTO, Long id) {

        Post post = postRepository.findById(id).orElseThrow(() -> new NotFoundException("No post found with id: " + id, "404", HttpStatus.NOT_FOUND));

        post.setTitle(postDTO.title());
        post.setContent(postDTO.content());
        post.setCategory(postDTO.category());
        post.setTags(postDTO.tags());

        return postRepository.save(post);
    }

    @Override
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
