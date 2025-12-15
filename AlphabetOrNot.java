// Check Whether a Character is Alphabet or Not
public class AlphabetOrNot {
    public static void main(String[] args) {
        char ch = 'g'; 

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }
}
