import java.util.Scanner;

public class ch4_min_max_array {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int min = 0, max = 0, i;
            System.out.println("Enter the siz eof array");
            int n = input.nextInt();
            int a[] = new int[n];
            for (i = 0; i < n; i++) {
                min = a[0];
                max = a[0];
                a[i] = input.nextInt();
            }
            System.out.println("Array element are : ");
            for (i = 0; i < n; i++) {
                System.out.printf("%d\t", a[i]);
            }
            for (i = 0; i < n; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
                 if (a[i] < min) {
                    min = a[i];
                }
            }
            System.out.println("\nMinimum = " + min);
            System.out.println("Maximum = " + max);
            input.close();
        }
    }

}
