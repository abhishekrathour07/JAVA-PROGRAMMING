import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ch10_SwitchArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            System.out.println("Enter your choice : ");
            System.out.println(
                    " 1) Add Element \n 2) Remove Element \n 3) Add in any position\n 4)Sort Elements \n 5) Replace element in the array\n 6) Display \n 7) Exit \n");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to Add in Array");
                    int add = sc.nextInt();
                    list.add(add);
                    break;
                case 2:
                    System.out.println("Enter the index to delete from array");
                    int del = sc.nextInt();
                    list.remove(del);
                    break;
                case 3:
                    System.out.println("Enter the index to add");
                    int index = sc.nextInt();
                    System.out.println("Enter the element to add");
                    int ele = sc.nextInt();
                    list.add(index, ele);
                    break;
                case 4:
                    System.out.println("Element in the Array after sorting");
                    Collections.sort(list);
                    break;
                case 5:
                    System.out.println("Enter the index to replace");
                    int i = sc.nextInt();
                    System.out.println("Enter the element to insert");
                    int e = sc.nextInt();
                    list.set(i, e);
                    break;
                case 6:
                    System.out.println("Array list are : ");
                    System.out.println(list);
                    break;

            }
            if (choice == 7) {
                break;
            }
        }
        sc.close();
    }
}
