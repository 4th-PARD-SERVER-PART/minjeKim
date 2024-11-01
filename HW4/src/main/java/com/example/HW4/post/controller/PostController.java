package com.example.HW4.post.controller;

import com.example.HW4.post.dto.PostRequest;
import com.example.HW4.post.service.PostService;
<<<<<<< HEAD
=======
import com.example.HW4.user.dto.UserRequest;
>>>>>>> 03036c2 (Initial commit with latest state)
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
<<<<<<< HEAD
=======

    @PatchMapping("/{userId}")
    public void updatePost(@PathVariable Long userId,@RequestBody PostRequest.PatchPostRequest req){
        postService.updatePost(userId,req);
    }

    @DeleteMapping("/{userId}")
    public void deletePost(@PathVariable Long userId, @RequestBody PostRequest.DeletePostRequest req){
        postService.deletePost(userId,req);
    }
>>>>>>> 03036c2 (Initial commit with latest state)
}
