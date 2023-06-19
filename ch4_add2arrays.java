import java.util.Scanner;

public class ch4_add2arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = input.nextInt();
        System.out.println("Enter the element in array 1");
        int[] arr1 = new int[size];
        for (int i = 0; i < size; i++) {
          arr1[i] = input.nextInt();
        }

        System.out.println("Enter the element in array 2");
        int[] arr2 = new int[size];
        for (int i = 0; i < size; i++) {
          arr2[i] = input.nextInt();
        }
        
        int[] sum = new int[size];
        for ( int i=0;i<size;i++){
             sum[i] = arr1[i] +arr2[i];
        }
        System.out.println("Element in array 1 are :");
        for(int i=0;i<size;i++){
            System.out.printf("%d\t",arr1[i]);
        }
        System.out.println("\nElement in array 2 are :");
        for(int i=0;i<size;i++){
            System.out.printf("%d\t",arr2[i]);
        }
        System.out.println("\nElement after adding arr1 + arr2");
            for(int i=0;i<size;i++){
            System.out.printf("%d\t",sum[i]);
        }  
        input.close();          
    }

}
