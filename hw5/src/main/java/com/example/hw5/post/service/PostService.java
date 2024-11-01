package com.example.hw5.post.service;

import com.example.hw5.post.dto.PostRequest;
import com.example.hw5.post.dto.PostResponse;
import com.example.hw5.post.entity.Post;
import com.example.hw5.post.repository.PostRepository;
import com.example.hw5.user.entity.User;
import com.example.hw5.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {
    private final UserRepository userRepository;
    private final PostRepository postRepository;

    public void createPost(Long userId, PostRequest.PostCreateRequest req){
        Optional<User> u = userRepository.findById(userId);
        User user = u.get();
        Post post = Post.from(req.getTitle(), req.getContent(), user);
        postRepository.save(post);
    }

    public void updatePost(Long userId,PostRequest.PatchPostRequest req){
        Optional<Post> posts=postRepository.findById(req.getPostId());
        Post post=posts.get();
        if(post.getUser().getId().equals(userId)){
            post.setTitle(req.getTitle());
            post.setContent(req.getContent());
            postRepository.save(post);
        }
    }

    public void deletePost(Long userId, PostRequest.DeletePostRequest req){
        Optional<Post> posts=postRepository.findById(req.getPostId());
        Post post=posts.get();
        if(post.getUser().getId().equals(userId)){
            postRepository.delete(post);
        }
    }
}