import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, j, k;
        System.out.println("Enter the size of an array");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the element in the array");
        for (i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    for (k = i; k < n-1; k++) {
                        a[k] = a[k + 1];
                    }
                    j--;
                    n--;
                }
            }
        }
        System.out.println("Array element after removing duplicate element");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

}
