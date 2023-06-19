import java.util.Scanner;

public class ch4_Arraytraversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = input.nextInt();
        System.out.println("Enter the element in array");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Element in arrays are ");
        for (int i = 0; i < size; i++) {
            System.out.printf("%d\t", arr[i]);
        }
        input.close();
    }
}
