import java.util.Scanner;

public class twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        if(age<18){
            System.out.println("You are minor");
            System.out.println("Not eligible to work");
        }
        else
        if(age>=18&&age<60)
        {
            System.out.println("You are eligible to work");
        }
        else
        {
            System.out.println("you are too old to work");
            System.out.println("Please collect you pension");
        }
    }
}
