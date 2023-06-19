import java.util.Scanner;

public class ch2_studentmarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s1, s2, s3, s4, s5;
        float total, per;

        System.out.println("Enter the marks in Hindi");
        s1 = input.nextInt();
        System.out.println("Enter the marks in English");
        s2 = input.nextInt();
        System.out.println("Enter the marks in Java");
        s3 = input.nextInt();
        System.out.println("Enter the marks in CA");
        s4 = input.nextInt();
        System.out.println("Enter the marks in DBMS");
        s5 = input.nextInt();
        total = s1 + s2 + s3 + s4 + s5;
        per = total / 5;
        System.out.println("Total marks is :- "+total);
        if (per <= 40 || s1 <= 33 && s2 <= 33 && s3 <= 33 && s4 <= 33 && s5 <= 33) {
            System.out.printf("Your percentage is %f And you are fail", per);
        } else if (per >= 40 && per <= 55) {
            System.out.printf("Your per is %f and ypur grade is D", per);
        } else if (per >= 55 && per <= 70) {
            System.out.printf("Your per is %f and ypur grade is C", per);
        } else if (per >= 70 && per <= 85) {
            System.out.printf("Your per is %f and ypur grade is B", per);
        } else if (per >= 85 && per <= 100) {
            System.out.printf("Your per is %f and ypur grade is A", per);
        }
            input.close();
    }

}
