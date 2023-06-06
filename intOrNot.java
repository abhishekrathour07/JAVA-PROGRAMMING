import java.util.Scanner;

public class intOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value to check Integer");
        System.out.println(input.hasNextInt());
        input.close();
    }
}
