
import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        float a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks in sub1 ");
        a = input.nextFloat();
        System.out.println("Enter the marks in sub1 ");
        b = input.nextFloat();
        System.out.println("Enter the marks in sub1 ");
        c = input.nextFloat();
        float marks = (a + b + c) / 30;
        System.out.println("Total CGPA = " + marks);
        if (marks <= 10.0 && marks >= 8.0)
            System.out.println("Total CGPA is  " + marks + " and you got grade A");
        if (marks >= 7.0)
            System.out.println("Total CGPA is  " + marks + " and you got grade B");
        if (marks >= 6.0)
            System.out.println("Total CGPA is  " + marks + " and you got grade C");
        if (marks >= 5.0)
            System.out.println("Total CGPA is  " + marks + " and you got grade D");
            input.close();
    }
}
