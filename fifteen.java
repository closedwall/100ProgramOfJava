import java.util.Scanner;

public class fifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two string");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s = s1+" "+s2;
        System.out.println(s);
        sc.close();
    }
}
