import java.util.Scanner;

public class ch4_Duplicate {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int i;
      System.out.println("Enter the size of an array");
      int n = input.nextInt();
      System.out.println("Enter the element in arrsy");
      int arr[] = new int[n];
      for (i = 0; i < n; i++) {
         arr[i] = input.nextInt();
      }
      System.out.println("Array element are :- ");
      for (i = 0; i < n; i++) {
         System.out.printf("%d\t", arr[i]);
      }
      for (i = 0; i < n; i++) {
         for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
               for (int k = j; k < n; k++) {
                  arr[k] = arr[k + 1];
               }
               n--;
               j--;
            }
         }
      }
      System.out.println("Array element after removing dublicate is : ");
      for (i = 0; i < n; i++) {
         System.out.printf("%d\t", arr[i]);
      }

   }
}
