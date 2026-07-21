package com.cognizant.week3.ioc;

public class StudentService {
    private Student student;
    public void setStudent(Student student) { this.student = student; }
    public void displayStudent() { System.out.println("Student: " + student.getName()); }
}
