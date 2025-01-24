package com.juan.app_spring_01.config;

import com.juan.app_spring_01.domain.User;
import com.juan.app_spring_01.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class instantiation implements CommandLineRunner {

    @Autowired private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User felix = new User (null, "Felix", "felix@gmail.com");
        User joao = new User (null, "João", "joaox@gmail.com");
        User beatriz = new User (null, "Beatriz", "beatriz@gmail.com");

        userRepository.saveAll(Arrays.asList(felix, joao, beatriz));

    }
}
