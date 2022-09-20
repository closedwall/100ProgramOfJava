import java.util.Scanner;

public class thirtyOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int r,sum=0,q,temp;
        temp = num;
        while(temp>0)
        {
            r = temp%10;
            sum=10*sum+r;
            temp = temp/10;
        }
        if(sum==num)
        System.out.println("The given number is palindrome");
        else
        System.out.println("The given number is not palindrome");
        
    }
}
