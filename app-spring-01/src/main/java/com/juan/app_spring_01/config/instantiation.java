package com.juan.app_spring_01.config;

import com.juan.app_spring_01.domain.Post;
import com.juan.app_spring_01.domain.User;
import com.juan.app_spring_01.dto.AuthorDTO;
import com.juan.app_spring_01.repository.PostRepository;
import com.juan.app_spring_01.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;

@Configuration
public class instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        userRepository.deleteAll();
        postRepository.deleteAll();

        User felix = new User (null, "Felix", "felix@gmail.com");
        User joao = new User (null, "João", "joaox@gmail.com");
        User beatriz = new User (null, "Beatriz", "beatriz@gmail.com");

        userRepository.saveAll(Arrays.asList(felix, joao, beatriz));

        Post post1 = new Post(null,sdf.parse("22/05/2024"),"Viajar","Viagem para o rio de janeiro!", new AuthorDTO(felix) );
        Post post2 = new Post(null,sdf.parse("24/06/2024"),"Chegando","Chegando em casa!", new AuthorDTO(felix));

        postRepository.saveAll(Arrays.asList(post1, post2));

        joao.getPosts().addAll(Arrays.asList(post1, post2));
        userRepository.save(joao);
    }
}
