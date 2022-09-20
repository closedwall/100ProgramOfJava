import java.util.Scanner;

public class twentyone {
    public static void main(String[] args) {
        System.out.println("this is the program to find wether the string contain vowel or not");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        int flag=0,i=0;
        while(i<s.length())
        {

            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                flag=1;
                break;
            }
            i++;
        }
        if(flag==1)
        System.out.println("Given string contains vowel");
        else
        System.out.println("string is without vowel");
        sc.close();
    }
}
