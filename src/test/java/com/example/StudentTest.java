package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StudentTest {
    
    @Test
    public void testAgeImplementation() {
        // Create a Student object
        Student student = new Student("Test", 25);
        
        // Test getter for age
        assertEquals(25, student.getAge(), "Getter for age is not implemented correctly.");
        
        // Test setter for age
        student.setAge(30);
        assertEquals(30, student.getAge(), "Setter for age is not implemented correctly.");
    }
}
