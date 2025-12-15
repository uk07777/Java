//Java Program to Compute Quotient and Remainder
import java.util.Scanner;
public class QuotientRemainder{
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("enter your input number:");
    int num=input.nextInt();
    System.out.println("enter your divisor:");
    int div=input.nextInt();
    int Quotient,Remainder;
    Quotient=num/div;
    Remainder=num%div;
    System.out.println("The Quotient and Remainder of "+num+" when divisble by " +div+ " is " +Quotient+ " and "+Remainder+ " Respectively");
}
}