// Multiply Two Floating point numbers
import java.util.Scanner;
public class Multiplication{
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("enter your first number:");
    float num1=input.nextFloat();
    System.out.println("enter your second input:");
    float num2=input.nextFloat();
    float result=num1*num2;
    System.out.printf("%.2f + %.2f = %.2f",num1,num2,result);
}
}