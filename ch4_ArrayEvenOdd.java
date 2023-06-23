import java.util.Scanner;

public class ch4_ArrayEvenOdd {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the size of Array");
            int n = input.nextInt();
            int i;
            int arr[] = new int[n];

            System.out.println("Enter the element in Array");
            for (i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            System.out.println("Array element are : ");
            for (i = 0; i < n; i++) {
                System.out.print(arr[i] + "  ");
            }

            System.out.println("\nEven array are : ");
            for (i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.printf("%d\t", arr[i]);

                }
            }
            System.out.println("\nOdd array are : ");
            for (i = 0; i < n; i++) {
                if (arr[i] % 2 != 0) {
                    System.out.printf("%d\t", arr[i]);
                }

                input.close();
            }
        }
    }
}
