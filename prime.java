import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int num, i, prime = 0;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the num to check prime or not");
            num = input.nextInt();

            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println("No , it is not a prime number");
                    prime = 1;
                    break;
                }
            }
            if (prime == 0) {
                System.out.println("Yes , it is a prime number");
            }
            input.close();
        }
    }
}
