//Prime numbers within a range
import java.util.Scanner;
class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your lower limit: ");
        int Lower = sc.nextInt();
        System.out.print("Enter your upper limit: ");
        int Upper = sc.nextInt();

        System.out.print("Prime numbers between " + Lower + " and " + Upper + " are: ");
        for (int num = Lower; num <= Upper; num++) {
            if (num <= 1) continue; // 0 and 1 are not prime
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
