package com.juan.app_spring_01.service;

import com.juan.app_spring_01.domain.Post;
import com.juan.app_spring_01.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id) {
        return postRepository.findById(id).orElse(null);
    }
}

