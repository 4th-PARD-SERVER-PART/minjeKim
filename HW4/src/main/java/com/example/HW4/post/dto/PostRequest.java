package com.example.HW4.post.dto;

<<<<<<< HEAD
=======
import com.fasterxml.jackson.annotation.JsonInclude;
>>>>>>> 03036c2 (Initial commit with latest state)
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class PostRequest {
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PostCreateRequest {
        private String title;
        private String content;
    }
<<<<<<< HEAD
=======

    @Getter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PatchPostRequest {
        private Long postId;
        private String title;
        private String content;
    }

    @Getter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NoArgsConstructor
    @AllArgsConstructor
    public static class DeletePostRequest {
        private Long postId;
    }


>>>>>>> 03036c2 (Initial commit with latest state)
}
