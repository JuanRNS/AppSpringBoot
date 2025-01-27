package com.juan.app_spring_01.service;

import com.juan.app_spring_01.domain.Post;
import com.juan.app_spring_01.domain.User;
import com.juan.app_spring_01.dto.UserDTO;
import com.juan.app_spring_01.repository.PostRepository;
import com.juan.app_spring_01.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id) {
        return postRepository.findById(id).orElse(null);
    }
}

