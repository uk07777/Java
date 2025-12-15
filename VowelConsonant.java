//Check Whether an Alphabet is Vowel or Consonant
public class VowelConsonant{
    public static void main(String[] args){
        char ch='z';
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            System.out.print(ch+" is vowel");
        else 
           System.out.print(ch+ " is not a vowel");
    }
}