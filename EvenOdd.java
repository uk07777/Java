//Check whether a number is even or odd
import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("enter your number:");
    int num=input.nextInt();
    if(num%2==0){
        System.out.print("it is even");
    }
    else {
        System.out.print("it is odd");
    }
}
}