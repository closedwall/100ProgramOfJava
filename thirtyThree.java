import java.util.Scanner;

//program to multiply two matrix
public class thirtyThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and column of the matric 1: ");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        System.out.println("Enter the rows and column of the matric 2: ");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        if(col1==row2)
        {
            System.out.println("Given dimention is able to perform matrix multiplication");
            int [][] arr = new int [row1][col1];
            int [][] arr1 = new int [row2][col2];
            int [][] multi = new int [row1][col2];
            System.out.println("Enter the content of first matrix");
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<col1;j++)
                {
                    int temp = sc.nextInt();
                    arr[i][j]=temp;
                }
            }
            System.out.println("Enter the content of second matrix");
            for(int i=0;i<row2;i++)
            {
                for(int j=0;j<col2;j++)
                {
                    int temp = sc.nextInt();
                    arr1[i][j]=temp;
                }
            }
            multiplication(arr,arr1,multi);
            System.out.println("multipication of Given Matrices is: ");
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<col2;j++)
                {
                    System.out.print(multi[i][j]+" ");
                }
                System.out.println();
            }

        }
        else
            System.out.println("Unable to perform matrix multiplication try with another dimention");
    sc.close();
    }

    private static void multiplication(int[][] arr, int[][] arr1, int[][] multi) {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                int sum=0;
                for(int k=0;k<arr1.length;k++)
                {
                sum+= arr[i][k]*arr1[k][j];
                }
                multi[i][j]=sum;

            }
            
        }
    }
}
