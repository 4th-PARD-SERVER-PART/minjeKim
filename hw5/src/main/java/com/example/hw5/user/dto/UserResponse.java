package com.example.hw5.user.dto;

import com.example.hw5.post.dto.PostResponse;
import com.example.hw5.user.entity.User;
import lombok.*;

import java.util.List;

public class UserResponse {
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ReadUser{
        private String name;
        private String email;
        private List<PostResponse.PostReadResponse> posts;

        public static ReadUser from(User user){
            return new ReadUser(user.getName(), user.getEmail(),
                    PostResponse.PostReadResponse.postToDto(user.getPosts()));
        }
    }
}
