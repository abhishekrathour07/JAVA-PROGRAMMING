import java.util.Scanner;

public class newex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to IITM");
        System.out.println("Enter the Marks  in stattistics");
        int a = sc.nextInt();
        System.out.println("Eneter the Marks  in math");
        int b = sc.nextInt();
        System.out.println("Eneter the Marks  in CT");
        int c = sc.nextInt();
        System.out.println("Eneter the Marks  in English");
        int d = sc.nextInt();
        int total = a + b + c + d;
        float per = total / 4;
        System.out.println("YOur Per is " + per);
        if (per >= 50 && a > 40 && b > 40 && c > 40 && d > 40) {
            System.out.println("You are pass Congratulation !");
        } else {
            System.out.println("You are fail but Try again next Year  ");
        }
    }

}
