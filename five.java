import java.io.IOException;
import java.util.Scanner;

public class five {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in fehrenheit: ");
        Float f = sc.nextFloat();
        Float c;
        c = 5*(f-32)/9;
        System.out.println("Temperature in degree celcius is %.2f: "+c);
        sc.close();
    }
}
