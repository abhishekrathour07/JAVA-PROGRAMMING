import java.util.Scanner;

public class ch5_factorial {
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find factorial");
        int x = input.nextInt();
        System.out.println("Factorial = " + fact(x));
        input.close();
    }
}
