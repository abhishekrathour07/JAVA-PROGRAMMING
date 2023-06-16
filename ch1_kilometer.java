
import java.util.Scanner;

public class ch1_kilometer {
    public static void main(String[] args) {
        double k, m;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the kilometer to convert in miles");
        k = input.nextFloat();
        m = k * 0.621371;
        System.out.println( k+" kilometer into the miles are :- " + String.format("%.3f", m));
        input.close();
    }

}
