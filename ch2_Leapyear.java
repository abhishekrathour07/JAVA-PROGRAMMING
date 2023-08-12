import java.util.Scanner;

public class ch2_Leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.println("Enter the Year to check leap year");
        year = input.nextInt();
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.printf("Enter year is %d and it is Leap Year", year);
        } else {
            System.out.printf("Enter year is %d And it is not a Leap Year", year);
        }
        input.close();
    }

}
