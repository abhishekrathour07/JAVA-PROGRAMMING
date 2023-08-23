// Write a Java program that takes a number as input and prints its multiplication
// table using for loop.

import java.util.Scanner;

public class ch14_online1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to find multiplication table");
        int n = sc.nextInt();
        for(int i =1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
        sc.close();
    }
}
