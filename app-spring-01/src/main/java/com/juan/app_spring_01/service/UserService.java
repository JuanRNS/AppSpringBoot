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
    public void delete(String id){
        userRepository.deleteById(id);
    }
    public User update(User user) {
        User userDes = userRepository.findById(user.getId()).get();
        updateUser(userDes,user);
        return userRepository.save(userDes);
    }

    private void updateUser(User userDes, User user) {
        userDes.setName(user.getName());
        userDes.setEmail(user.getEmail());
    }

    public User fromDto(UserDTO user) {
        return new User(user.getId(),user.getName(), user.getEmail());
    }
}

