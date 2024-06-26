package com.example.springbootlearning.student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
        if (studentOptional.isPresent()) {
            throw new IllegalStateException("Email is already in the database");
        }
        studentRepository.save(student);
    }

    public void deleteStudent(long studentId) {
        if (!studentRepository.existsById(studentId)) {
            throw new IllegalStateException("The student with id " + studentId + " does not exist");
        }
        studentRepository.deleteById(studentId);
    }

    @Transactional
    public void updateStudent(long studentId, String name, String email) {
        Student existingStudent = studentRepository.findById(studentId).orElseThrow(() -> new IllegalStateException("The student with id " + studentId + " does not exist"));
        if (name != null && !name.equals(existingStudent.getName())) {
            existingStudent.setName(name);
        }
        if (email != null && !email.equals(existingStudent.getEmail())) {
            Optional<Student> optionalStudent = studentRepository.findStudentByEmail(email);
            if (optionalStudent.isPresent()) {
                throw new IllegalStateException("The student with email " + email + " already exists.");
            }
            existingStudent.setEmail(email);
        }
    }
}
