//Leap Year
import java.util.Scanner;
public class LeapYear{
public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.print("enter a year:");
    int input1=input.nextInt();
    if((input1%4==0 && input1%100!=0)||(input1%400==0)){
        System.out.print("it is a leap year");
    }
    else{
        System.out.print("Not a leap year");
    }
}
}