// Write a Java program to create a class called Dog with instance variables name and color. 
// Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables.
//  Print the values of the variables.
public class Pgm2{
    public static void main(String[] args) {
        Dog d = new Dog("Tommy","Black");
        System.out.println(d.name +","+d.color);
    }
}
class Dog{
    String name;
    String color;
    Dog(String name,String color){ //Parameterized Constructor
        this.name=name;
        this.color=color;
    }
}