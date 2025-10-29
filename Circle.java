//  Write a Java program to create a class called "Circle" with a radius attribute. 
//  You can access and modify this attribute.
//  Calculate the area and circumference of the circle.
public class Circle {
    public static void main(String[] args) {
        CircleArea c1 = new CircleArea(9);
        System.out.println("The Area of the circle = " + c1.getArea());
        System.out.println("The Circumference of the circle = " + c1.getCircumference());
        c1.setRadius(5);
        System.out.println("After updating radius to 5:");
        System.out.println("The Area of the circle = " + c1.getArea());
        System.out.println("The Circumference of the circle = " + c1.getCircumference());

    }
}
class CircleArea {
    int radius;

    public CircleArea(int radius) {
        this.radius = radius;
    }
    int getRadius() {
        return radius;
    }
    void setRadius(int radius) {
        this.radius = radius;
    }
    double getArea() {
        return Math.PI * radius * radius;
    }
    double getCircumference() {
        return 2 * Math.PI * radius;
    } 
}
