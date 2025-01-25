package com.juan.app_spring_01.service;

import com.juan.app_spring_01.domain.User;
import com.juan.app_spring_01.dto.UserDTO;
import com.juan.app_spring_01.repository.UserRepository;
import com.juan.app_spring_01.service.exception.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(String id) {
        return userRepository.findById(id).get();
    }

    public User insert(User user) {
        return userRepository.insert(user);
    }
    public User fromDto(UserDTO user) {
        return new User(user.getId(),user.getName(), user.getEmail());
    }
}

