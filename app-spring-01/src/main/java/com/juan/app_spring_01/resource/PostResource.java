package com.juan.app_spring_01.resource;


import com.juan.app_spring_01.domain.Post;
import com.juan.app_spring_01.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService postService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {

        Post post = postService.findById(id);
        return ResponseEntity.ok().body(post);
    }




}
