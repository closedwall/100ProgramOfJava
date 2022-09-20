import java.util.Scanner;

public class twentysix {

    public static void main(String[] args) {
        // range
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the min and max value");
        int min = sc.nextInt();
        int max = sc.nextInt();
        int count=0;
        // int min = 2;
        // int max = 100;
        // find all prime numbers in the given range
        for (int n = min; n <= max; n++) {
            // check if this number is prime
            if (isPrime(n)) {
                // System.out.println(n);
                count++;
            }
        }
        System.out.println("the number of prime numbers in the given range is: "+count);
    }

    public static boolean isPrime(int num) {
        if(num==1)
        return false;
        for (int i = 2; i <= num / i; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}