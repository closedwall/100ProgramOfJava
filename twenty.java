import java.util.Scanner;

public class twenty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of reverse number");
        int n = sc.nextInt();
        while(n>0)
        {
            System.out.print(n+" ");
            n--;
        }
    }
}
