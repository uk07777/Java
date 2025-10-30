// Write a Java program to create a class called "Bank" with a collection of accounts and methods
//  to add and remove accounts, and to deposit and withdraw money.
//  Also define a class called "Account" to maintain account details of a particular customer.
import java.util.ArrayList;

public class BankAccount{
    public static void main(String[] args) {
        
    }}
class Bank{
    String HolderName;
    double AccId;
    double Balance;
    private static ArrayList<Bank>bankCollection =new ArrayList<Bank>();

    public Bank(String HolderName, double AccId,double Balance){
        this.HolderName=HolderName;
        this.AccId=AccId;
        this.Balance=Balance;
    }
     String getHolderName(){
        return HolderName;
     }
     double AccID(){
        return AccId;
     }
     double Balance(){
        return Balance;
     }
     void setHolderName(String HolderName){
        this.HolderName=HolderName;
     }
     void setAccID(double AccId){
        this.AccId=AccId;
     }
     void setBalance(double Balance){
        this.Balance=Balance;
     }
    public void add_fund(double Fund){
        Balance+=Fund;
    }
    public void remove_fund(double remove){
        Balance-=remove;
    }
     public static void add_Account(Bank bank){

        bankCollection.add(bank);
     }

     public static void remove_Account(Bank bank){

        bankCollection.remove(bank);
     }

     public static  ArrayList<Bank> get_BankCollection(){
        return bankCollection;

     }
}


// } public static void add_Book(Book book) {//important
//         bookCollection.add(book);
//     }

//     public static void remove_Book(Book book) {
//         bookCollection.remove(book);
//     }

//     public static ArrayList<Book> get_BookCollection() {
//         return bookCollection;
//     }