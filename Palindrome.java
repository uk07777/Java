//Palindrome of a number
class Palindrome{
    public static void main(String[] args){
        int num=112211;
        int temp=num;
        int reversed=0;
        while(temp!=0){
            int digit=temp%10;
            reversed=reversed*10+digit;
            temp=temp/10;
        }
        if(num==reversed){
            System.out.print("It is Palindorme");
        }
        else{
            System.out.print("It is Not Palindrome");
        }
        
    }
}