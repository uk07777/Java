// Write a Java program to create a class called "Book" with instance variables title, author, and price. 
// Implement a default constructor and two parameterized constructors:

// One constructor takes title and author as parameters.
// The other constructor takes title, author, and price as parameters.
// Print the values of the variables for each constructor.
public class Pgm3 {
    private String title;
    private String author;
    private int price;

    // Default Constructor
    Pgm3() {
        title = "UK";
        author = "Ujjual";
        price = 1000;
    }

    // Parameterized Constructor (title, author)
    Pgm3(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0;  // default price
    }

    // Parameterized Constructor (title, author, price)
    Pgm3(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to print details
    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        Pgm3 book1 = new Pgm3(); // default constructor
        Pgm3 book2 = new Pgm3("Java Basics", "James Gosling"); // 2-arg constructor
        Pgm3 book3 = new Pgm3("Python Guide", "Guido van Rossum", 550); // 3-arg constructor

        book1.display();
        book2.display();
        book3.display();
    }
}

