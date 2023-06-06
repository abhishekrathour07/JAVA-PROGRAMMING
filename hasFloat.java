import java.util.Scanner;

public class hasFloat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value to  check");
        System.out.println(input.hasNextFloat());
        input.close();
    }
}
