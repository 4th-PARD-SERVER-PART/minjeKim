package com.example.seminar4.user.repository;

import com.example.seminar4.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
