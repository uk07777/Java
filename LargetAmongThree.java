//Largest Among Three Nos
public class LargestAmongThree{
    public static void main(String[] args){
        int a=10,b=20,c=5;
        if(a>=b && a>=c){
            System.out.print(a+" is Largest!");
        }
        else if(b>=a && b>=c){
            System.out.print(b+" is Largest!");
        }
        else{
            System.out.print(c+" is Largest!");
        }
    }
}