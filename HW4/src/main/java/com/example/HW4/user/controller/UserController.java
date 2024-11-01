package com.example.HW4.user.controller;

import com.example.HW4.user.dto.UserRequest;
import com.example.HW4.user.dto.UserResponse;
import com.example.HW4.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> 03036c2 (Initial commit with latest state)
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

<<<<<<< HEAD
    @GetMapping("/{userId}")
    public UserResponse.ReadUser getUser(@PathVariable Long userId){
        return userService.readUser(userId);
    }

=======
>>>>>>> 03036c2 (Initial commit with latest state)
    @PostMapping("")
    public void createUser(@RequestBody UserRequest.UserCreateRequest req){
        userService.createUser(req);
    }
<<<<<<< HEAD
=======
    @GetMapping("/{userId}")
    public UserResponse.ReadUser getUser(@PathVariable Long userId){
        return userService.readUser(userId);
    }
>>>>>>> 03036c2 (Initial commit with latest state)

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId){
        userService.deleteUser(userId);
    }
}
