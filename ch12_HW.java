import java.util.Scanner;

public class ch12_HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int a = sc.nextInt();
        System.out.println("Enter the number 2");
        int b = sc.nextInt();
        if (b % a == 0) {
            System.out.println(a + " is multiple of " + b);
        } else {
            System.out.println(a + " is not multiple of " + b);
        }
    }
}
