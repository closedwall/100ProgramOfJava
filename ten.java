import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you eligible for going to theater: ");
        System.out.println("Enter the age of the child: ");
        int age = sc.nextInt();
        if(age>=18)
        System.out.println("Allowed");
        else
        System.out.println("Not allowed");
    }
}
