package com.juan.app_spring_01.service;

import com.juan.app_spring_01.domain.User;
import com.juan.app_spring_01.repository.UserRepository;
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
}
