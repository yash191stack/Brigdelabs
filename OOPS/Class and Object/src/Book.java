package com.bridgelabz.oops.levelone;

class Book {
    String title;
    String author;
    double price;

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.title = "The Java Handbook";
        b.author = "Patrick Naughton";
        b.price = 799.50;

        b.displayBookDetails();
    }
}
