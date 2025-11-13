// Write a Java program to create a class called "Library" with a collection of books and methods to add and remove books.
import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        LibraryDetails l1 = new LibraryDetails("UK Memorial Library");

        l1.addBook("gk");
        l1.addBook("pk");
        l1.printDetails();

        l1.removeBook("gk"); // use the correct book name here
        System.out.println("After dropping:");
        l1.printDetails();
    }
}

class LibraryDetails {
    String name;
    ArrayList<String> shelf = new ArrayList<String>();

    public LibraryDetails(String name) {
        this.name = name;
    }

    public void addBook(String newBook) {
        shelf.add(newBook);
    }

    public void removeBook(String removeBook) {
        shelf.remove(removeBook);
    }

    public void printDetails() {
        System.out.println("Library name: " + name);
        System.out.println("Remaining books: " + shelf);
    }
}
