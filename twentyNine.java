import java.util.Scanner;

public class twentyNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            System.out.println(str.substring(i,j));
        }
    }
}


//to avoid duplicate element we can use below code
// import java.util.HashSet;
// import java.util.Scanner;

// public class twentyNine {
//     public static void main(String[] args) {
//         HashSet <String> substr = new HashSet<>();
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the string");
//         String str = sc.nextLine();
//         for(int i=0;i<str.length();i++)
//         {
//             for(int j=i+1;j<=str.length();j++)
//             substr.add(str.substring(i,j));
//         }
//         System.out.println(substr);
//     }
// }
