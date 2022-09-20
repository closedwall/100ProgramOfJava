import java.util.Scanner;

public class twentyfour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] list = {"Radhika","shiromani","ahswagandha","Tilak"};
        for(String name: list){
            System.out.println(name);
        }
        sc.close();
    }
}
