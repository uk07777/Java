// 1. Write a Java program to create a class called "Person" with a name and age attribute.
//  Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

class Person {
    String name;
    int age;

    Person(String Name, int Age) {
        this.name = Name;
        this.age = Age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ujjual krishna", 22);
        Person p2 = new Person("Goutham krishna", 18);

        System.out.println("The name of the person is " + p1.name + " and age of the person is " + p1.age);
        System.out.println("The name of the person is " + p2.name + " and age of the person is " + p2.age);
    }
}
