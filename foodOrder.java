/*Write a Java program to implement a flexible restaurant ordering system. The system should allow the user to order multiple items. 
Each item must have a name and a price.
 Your program should:
 Prompt the user to enter the item name and the quantity they want.
 Calculate and display the price for each item ordered.
 After each item, ask the user “Do you want to order more items? (yes/no)” and allow them to continue ordering if they reply with "yes".
 If the user’s reply is not "yes", stop taking new orders and display the total cost of all items ordered.
 If the user enters an invalid item (not present in the available items), display an error and do not add to total cost.
 Use a loop for repeated orders and ensure case-insensitive matching for item names and user confirmation.
 Do not mention the predetermined food items or their prices in the question description; you may choose these yourself.*/
import java.util.Scanner;
class foodOrder{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double pizzaPrice=19.99;
        double burgerPrice=11.11;
        double dosaPrice=9.99;
        double cost=0;
        double totalCost=0;
        while(true){
            System.out.print("Enter your input: ");
            String input=sc.nextLine().trim();
            System.out.print("Enter your quantity: ");
            int count=sc.nextInt();
            sc.nextLine();
            if(input.equalsIgnoreCase("pizza")){
                cost=pizzaPrice*count;
                System.out.println("Pizza price = "+ cost);
                }
            else if(input.equalsIgnoreCase("burger")){
                cost=burgerPrice*count;
                System.out.println("Burger price = "+ cost);
            }
            else if(input.equalsIgnoreCase("dosa")){
                cost=dosaPrice*count;
                System.out.println("Dosa price ="+ cost);
            }
            else{
                System.out.println("Enter a proper input");
            }
             totalCost+=cost;
            System.out.println("Do you want to continue(Yes/No): ");
            String hlo=sc.nextLine().trim();
            if(!hlo.equalsIgnoreCase("yes")){
                break;
            }
            
        }System.out.print("Total bill = "+totalCost);
    }
}