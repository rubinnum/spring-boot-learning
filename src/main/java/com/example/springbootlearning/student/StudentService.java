package com.example.springbootlearning.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(1, "Roman", "romarypiak@gmail.com", LocalDate.of(2004, Month.NOVEMBER, 16), 19)
        );
    }

}
