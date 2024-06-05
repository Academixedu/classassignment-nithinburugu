/*
 * Requirements
Class Definition:

Define a class named Book.
Instance Variables:

The Book class should have private instance variables for the title (String), author (String), and number of copies (int).
Constructor:

The class should have a constructor that initializes the title, author, and number of copies of the book.
Getters and Setters:

Implement getter and setter methods for each instance variable.
The getter for the number of copies should return the current number of copies available.
The setter for the number of copies should allow updating the number of copies.
Additional Methods:

Implement a method displayBookDetails that prints the details of the book (title, author, and number of copies).
Implement a static method totalBooks that returns the total number of books created (use a static variable to keep track of the count).

Additional Instructions
understand the importance of encapsulation and how getters and setters help in maintaining it.
think about edge cases, such as setting negative values for the number of copies and how to handle them.
After implementing the class, test it with the example usage provided to ensure everything works correctly.
* 
 */

package com.example;

/**
 * Book
 */
public class Book {

    private String title;
    private int copies;
    private String author;
    public static int count = 0;

    public Book(String title, int copies, String author) {
        this.title = title;
        this.copies = copies;
        this.author = author;
        count++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Number of Copies : " + copies);
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Book.count = count;
    }

}