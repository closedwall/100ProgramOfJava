import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A persion can drive a heavy vehicles or not");
        int age = sc.nextInt();
        if(age>=25)
        System.out.println("You can drive");
        else
        System.out.println("you cannot drive ");
        sc.close();
    }
}
