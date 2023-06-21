import java.util.Scanner;

public class ch5_function {
    static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = input.nextInt();
        System.out.println("Enter the value of b");
        int b = input.nextInt();
        System.out.println("Sum of a+b = " + sum(a, b));
        ;

        input.close();
    }
}
