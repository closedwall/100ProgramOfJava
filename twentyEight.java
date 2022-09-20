public class twentyEight {
    public static void main(String[] args) {
        System.out.println("This is the program of Floyd's triangle");
        int tri=1;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
                System.out.print(tri+++" ");
            System.out.println();
        }
    }
}
