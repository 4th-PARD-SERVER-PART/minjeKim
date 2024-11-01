package com.example.hw5.post.controller;

import com.example.hw5.post.dto.PostRequest;
import com.example.hw5.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {
    private final PostService postService;

    @PostMapping("/{userId}")
    public void CreatePost(@PathVariable Long userId, @RequestBody PostRequest.PostCreateRequest req){
        postService.createPost(userId, req);
    }

    @PatchMapping("/{userId}")
    public void updatePost(@PathVariable Long userId,@RequestBody PostRequest.PatchPostRequest req){
        postService.updatePost(userId,req);
    }

    @DeleteMapping("/{userId}")
    public void deletePost(@PathVariable Long userId, @RequestBody PostRequest.DeletePostRequest req){
        postService.deletePost(userId,req);
    }
}
