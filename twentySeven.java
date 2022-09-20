import java.util.Scanner;

public class twentySeven {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r,q,pow,temp,sum=0;
        temp=num;
        pow=power(temp);
        while(temp>0)
        {
            r=temp%10;
            sum+=Math.pow(r, pow);
            temp/=10;
        }
        if(sum==num)
        System.out.println("The given number is Armstrong number");
        else
        System.out.println("The number is not Armstrong number");
        sc.close();
    }
    private static int power(int num) {
        int pow=0;
        while(num>0)
        {
            num/=10;
            pow++;
        }
        return pow;
    }
}
