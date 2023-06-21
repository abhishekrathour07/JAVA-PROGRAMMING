import java.util.Scanner;

public class ch2_FIbo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t1 = 0, t2 = 1, t3 = t1 + t2;
        System.out.println("Enter the number to find the series if java");
        int n = input.nextInt();
        System.out.print("the series if given number is " + t1 +"," +t2 + ",");
        for (int i = 2; i < n; i++) {
            System.out.print(t3 + ",");
            t1 = t2;
            t2 = t3;
            t3 = t1 + t2;
        }
    }

}
