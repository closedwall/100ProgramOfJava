import java.util.Scanner;

public class forteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial is to find: ");
        int n = sc.nextInt();
        System.out.println("the factorial of given number is: "+factorial(n));

        sc.close();
    }

    private static int factorial(int n) {
        if(n==1)
        return 1;
        return n*factorial(n-1);
    }

    
}
