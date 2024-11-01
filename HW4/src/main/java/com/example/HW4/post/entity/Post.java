package com.example.HW4.post.entity;

import com.example.HW4.user.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    public static Post from(String title, String content, User user){
        return new Post(null, title, content, user);
    }
<<<<<<< HEAD
=======

    public void setTitle(String title){

        this.title = title;
    }
    public void setContent(String content){

        this.content = content;
    }
>>>>>>> 03036c2 (Initial commit with latest state)
}
