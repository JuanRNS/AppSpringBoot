package com.juan.app_spring_01.resource;


import com.juan.app_spring_01.domain.Post;
import com.juan.app_spring_01.resource.util.URL;
import com.juan.app_spring_01.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


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

    @GetMapping (value = "/titlesearch")
    public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "text", defaultValue = "") String title) {
        title = URL.encode(title);
        List<Post> listT = postService.findTitlle(title);
        return ResponseEntity.ok().body(listT);
    }

    @GetMapping(value = "/fullsearch")
    public ResponseEntity<List<Post>> findAll(
            @RequestParam(value = "text", defaultValue = "") String text,
            @RequestParam(value = "minDate", defaultValue = "") String minDate,
            @RequestParam(value = "maxDate", defaultValue = "") String maxDate) {
        text = URL.encode(text);
        Date min = URL.convert(minDate, new Date(0L));
        Date max = URL.convert(maxDate, new Date(0L));
        List<Post> listT = postService.findAll(text, min, max);
        return ResponseEntity.ok().body(listT);
    }


}
