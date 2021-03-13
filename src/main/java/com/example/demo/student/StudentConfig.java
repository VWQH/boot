package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository){
        return  args -> {
            Student maria =  new Student(
                    "Di Maria",
                    "maria.jama@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 6)
            );
            Student alex =  new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2001, Month.JANUARY, 6)
            );

            System.out.println("Config");
            studentRepository.saveAll(
                    List.of(maria, alex)
            );

        };
    }

}
