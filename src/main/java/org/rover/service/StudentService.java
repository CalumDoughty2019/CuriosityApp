package org.rover.service;

import org.rover.api.StudentResource;
import org.rover.dao.StudentMapper;
import org.rover.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentMapper studentMapper;
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentResource.class);

    public StudentService(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public Student getStudentById(int studentId){
        return studentMapper.getStudentById(studentId);
    }
}
