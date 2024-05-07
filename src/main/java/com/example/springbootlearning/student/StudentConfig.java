package com.example.springbootlearning.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;
import static java.time.Month.OCTOBER;

@Configuration
public class StudentConfig {

    @Bean
    public CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student Roman = new Student(
                    "Roma",
                    "roma@gmail.com",
                    LocalDate.of(2004, NOVEMBER, 16));

            Student Ihor = new Student(
                    "Veronika",
                    "nika@gmail.com",
                    LocalDate.of(2005, OCTOBER, 10));

            studentRepository.saveAll(List.of(Roman, Ihor));
        };
    }
}
