import java.util.Scanner;

public class ch4_ArrayHowMuchEvenOdd {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int even = 0, odd = 0, i;
            System.out.println("Enter the size of array");
            int n = input.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the element in the array");
            for (i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            for (i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    ++even;
                } else {
                    ++odd;
                }
            }
            System.out.println("Array Element are :");
            for (i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\nEven number are : " + even);
            System.out.println("Odd number are : " + odd);
            input.close();
        }
    }

}
