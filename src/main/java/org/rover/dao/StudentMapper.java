package org.rover.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.rover.model.Student;

@Mapper
public interface StudentMapper {

    Student getStudentById(@Param("studentId") int studentId);
}
