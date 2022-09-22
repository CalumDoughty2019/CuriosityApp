package org.rover.model;

import javax.validation.constraints.NotNull;
import java.util.Objects;

public final class Student {

    @NotNull
    private final int studentId;

    @NotNull
    private final String name;

    @NotNull
    private final String email;

    public Student(int studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && name.equals(student.name) && email.equals(student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, name, email);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
