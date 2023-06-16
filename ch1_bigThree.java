import java.util.Scanner;

public class ch1_bigThree {

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

        input.close();
    }
}
