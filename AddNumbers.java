//Add Two nos
import java.util.Scanner;
public class AddNumbers{
    public static void main(String[] args){
    System.out.println("enter your number:");
    Scanner input1=new Scanner(System.in);// reads the input
    int number1=input1.nextInt();
    System.out.println("enter your second number:");
    int number2 = input1.nextInt();
    int sum = number1+number2;
    System.out.println("your sum is :"+sum);
}
}