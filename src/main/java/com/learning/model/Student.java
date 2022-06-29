package com.learning.model;

public class Student {

    private String name;
    private String password;
    private int marks;
    private String college;

    public Student(String name, String password, int marks, String college) {
        this.name = name;
        this.password = password;
        this.marks = marks;
        this.college = college;
    }

    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", marks=" + marks +
                ", college='" + college + '\'' +
                '}';
    }
}
