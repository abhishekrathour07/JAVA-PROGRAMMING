// Java program to extract the first half of a string of even length

import java.util.Scanner;

public class ch14_online7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to find even length");
        String name = sc.next();
        int l = name.length();
        System.out.println(name);
        System.out.println(l);
        if (l % 2 == 0) 
            System.out.println("First half of string : " +name.substring(0, l / 2));
         else
            System.out.println("String length is not even");

            sc.close();
    }
}
