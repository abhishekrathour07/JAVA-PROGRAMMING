import java.util.Scanner;

public class ch4_linear_search {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the size of an array");
            int n = input.nextInt();
            int i, c = 0;
            System.out.println("Enter the element in array");
            int[] arr = new int[n];
            for (i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            System.out.println("Element in arrays are ");
            for (i = 0; i < n; i++) {
                System.out.printf("%d\t", arr[i]);
            }
            int search;
            System.out.println("Enter the element to search");
            search = input.nextInt();
            for (i = 0; i < n; i++) {
                if (arr[i] == search) {
                    System.out.printf("%d is found at %d position", search, i + 1);
                    c = 1;
                    break;
                }
            }
            if (c == 0)
                System.out.println("Element not present");
            input.close();
        }
    }
}
