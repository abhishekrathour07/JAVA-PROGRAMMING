import java.util.Scanner;

public class bigThree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three number");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("A is largest");
            } else {
                System.out.println("C is largest");
            }
        } else {
            if (b > c) {
                System.out.println("B is largest");
            } else {
                System.out.println("C is Largest");
            }
        }
        System.out.println("Equal value occurs");

        input.close();
    }
}
