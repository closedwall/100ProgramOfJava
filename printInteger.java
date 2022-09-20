import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class printInteger {
    public static void main(String[] args) throws IOException{
        // Scanner input = new Scanner(System.in);
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Integer");
        String a = bfr.readLine();
        int b = Integer.parseInt(a);
        System.out.println(b);
        // input.close();
    }
}
