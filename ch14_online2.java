// Java program to swap two variable....

import java.util.Scanner;

public class ch14_online2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Var 1");
        int x = sc.nextInt();
        System.out.println("Enter the value of Var 2");
        int y = sc.nextInt();
        int t = x;
        x = y;
        y = t;
        System.out.println(x);
        System.out.println(y);
 sc.close();
    }
}
