package com.eb2.bloggingplatformapi.controller;

import com.eb2.bloggingplatformapi.dto.PostDTO;
import com.eb2.bloggingplatformapi.entities.Post;
import com.eb2.bloggingplatformapi.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/todos")
    public ResponseEntity<List<Post>> getAllPosts(@RequestParam(required = false) String term) {
        return ResponseEntity.ok(postService.getAllPost(term));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> getPost(@PathVariable long id) {
        return new ResponseEntity<>(postService.getPostById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody PostDTO post) {
        return new ResponseEntity<>(postService.createPost(post), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Post> updatePost(@RequestBody PostDTO post, @PathVariable long id) {
        return ResponseEntity.ok(postService.updatePost(post, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable long id) {
        postService.deletePost(id);
        return ResponseEntity.noContent().build();
    }
}
