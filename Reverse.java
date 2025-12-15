//Reverse a NUmber
class Reverse{
    public static void main(String[] args){
        int num=1234,reversed=0;
        System.out.print("Original number is :"+num);
        while(num!=0){
            int digit=num%10;
            reversed=reversed*10+digit;
            num/=10;
        }System.out.print("\nReversed number is :"+reversed);
    }
}