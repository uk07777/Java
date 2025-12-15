//Java Program to Find ASCII Value of a character
import java.util.Scanner;
public class AsciiValue{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("enter a character:");
        char ch=input.next().charAt(0);
        int ascii = ch;
        System.out.println("The Ascii value of "+ ch + " is:" + ascii);
    }
}