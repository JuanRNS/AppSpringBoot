package com.juan.app_spring_01.service;

import com.juan.app_spring_01.domain.Post;
import com.juan.app_spring_01.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id) {
        return postRepository.findById(id).orElse(null);
    }

    public List<Post> findTitlle(String title) {
        return postRepository.findByTitle(title);
    }
    public List<Post> findAll(String text, Date minDate, Date maxDate) {
        return postRepository.fullSearch(text, minDate, maxDate);
    }

}

