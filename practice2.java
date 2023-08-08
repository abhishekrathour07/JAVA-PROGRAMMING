import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter your choice\n 1) add\n 2) Sub");
        ;
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the value of a and b");
                a = sc.nextInt();
                b = sc.nextInt();
                c = a + b;
                System.out.println(c);
                break;
            case 2:
                System.out.println("Enter the value of a and b");
                a = sc.nextInt();
                b = sc.nextInt();
                c = a - b;
                System.out.println(c);
                break;
        }
        sc.close();
    }

}