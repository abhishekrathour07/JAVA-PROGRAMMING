import java.util.Scanner;

public class ch1_firstlast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number to find the last and forst digit");
        int n = input.nextInt();
        int last = n % 10;
        while (n >= 10) {
            n = n / 10;
        }
        System.out.println("First number is " + n);
        System.out.println("Last number is " + last);
       input.close();
    }
}
