import java.util.Scanner;

public class ch1_hasFloat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value to  check");
        System.out.println(input.hasNextFloat());
        input.close();
    }
}
