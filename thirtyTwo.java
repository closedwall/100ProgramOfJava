import java.util.Scanner;

public class thirtyTwo {
    public static void main(String[] args) {
        System.out.println("Program to add two matrix");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimention of matrix: (Keeping in mind dimention of both the matrix should be same to add)");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int [n][m];
        int [][] arr1 = new int [n][m];
        int [][] sum = new int [n][m];
        System.out.println("Enter the content of first matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int temp = sc.nextInt();
                arr[i][j]=temp;
            }
        }
        System.out.println("Enter the content of second matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int temp = sc.nextInt();
                arr1[i][j]=temp;
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                
                sum[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        System.out.println("sum of Given Matrices is: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

    }
}
