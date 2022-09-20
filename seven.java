import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two integer");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("before swapping a is: "+a+" and b is: "+b);
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println("After swapping a is: "+a+" and b is: "+b);
        sc.close();
    }
}
