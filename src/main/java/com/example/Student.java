package com.example;

/**
 * Student
 */
public class Student {
    private int age;
    private String name;
    private static int studentCount = 0;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
        studentCount++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }
}