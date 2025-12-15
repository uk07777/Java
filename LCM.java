//LCM of Two Nos
class LCM{
    public static void main(String[] args){
        int a=15,b=20,g=0;
        for(int i=1;i<a;i++){
            if(a%i==0 && b%i==0){
            g=i;
        }
        }
        int LCM=a*b/g;
        System.out.print("LCM of Two Nos "+a+" and "+b+" is "+LCM);
    }
}