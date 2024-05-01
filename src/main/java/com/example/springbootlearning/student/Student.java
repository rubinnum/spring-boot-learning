package com.example.springbootlearning.student;

import lombok.*;

import java.time.LocalDate;

@Data @AllArgsConstructor
public class Student {
    private long id;
    private String name;
    private String email;
    private LocalDate dob;
    private int age;

    public Student(String name, String email, LocalDate dob, int age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }
}
