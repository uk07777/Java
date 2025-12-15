//  Check Whether a Number is Positive or Negative
import java.util.Scanner;
public class PositiveNegative{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=input.nextInt();
        if(num>0){
            System.out.print(num+" is positive");
        }
        else if(num<0){
            System.out.print(num+" is neagtive");
        }
        else{
            System.out.print(num+" is zero ");
        }
    }
}