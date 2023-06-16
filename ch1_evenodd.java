import java.util.Scanner;
public class ch1_evenodd {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        input.close();
    }
}
