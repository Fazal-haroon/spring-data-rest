package com.example.springdatarest;

import com.example.springdatarest.entity.User;
import com.example.springdatarest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataRestApplication.class, args);
    }

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = User.builder()
                .firstName("fazal")
                .lastName("Haron")
                .email("fa@gmail.com")
                .build();
        userRepository.save(user);
        User user2 = User.builder()
                .firstName("fazal2")
                .lastName("Haroon2")
                .email("fa2@gmail.com")
                .build();
        userRepository.save(user2);
    }
}
