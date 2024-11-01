package com.example.HW4.user.service;

import com.example.HW4.user.dto.UserRequest;
import com.example.HW4.user.dto.UserResponse;
import com.example.HW4.user.entity.User;
import com.example.HW4.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
=======
import java.util.List;
>>>>>>> 03036c2 (Initial commit with latest state)
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

<<<<<<< HEAD
=======
    public void createUser(UserRequest.UserCreateRequest req){
        User u = new User(null, req.getName(), req.getPosts());
        userRepository.save(u);
    }

>>>>>>> 03036c2 (Initial commit with latest state)
    public UserResponse.ReadUser readUser(Long id) {
        Optional<User> u = userRepository.findById(id);
        User user = u.get();
        UserResponse.ReadUser ret = UserResponse.ReadUser.from(user);
        return ret;
    }

<<<<<<< HEAD
    public void createUser(UserRequest.UserCreateRequest req){
        User u = new User(null, req.getName(), req.getPosts());
        userRepository.save(u);
    }
=======
>>>>>>> 03036c2 (Initial commit with latest state)

    public void deleteUser(Long userId){
        User user = userRepository.findById(userId).orElseThrow(IllegalAccessError::new);
        userRepository.delete(user);
    }
}

