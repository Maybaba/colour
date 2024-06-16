package com.colourProject.service;

import com.entity.User;
import com.colourProject.dto.request.UserRequest;
import com.colourProject.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    //의존성 주입
    private final UserMapper userMapper;

    //새로운 사용자 받기
    public void createUser(UserRequest userRequest) {
        User user = new User();
        user.setUsername(userRequest.getUsername());
        user.setPassword(userRequest.getPassword());
        user.setEmail(userRequest.getEmail());
        userMapper.insert(user);
    }

    public List<User> getAllUsers() {
        return userMapper.findAll();
    }

    public void registerUser(User user) {
        userMapper.insert(user);
    }
}