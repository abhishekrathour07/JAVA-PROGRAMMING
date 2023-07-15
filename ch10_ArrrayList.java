import java.util.ArrayList;
import java.util.Collections;

public class ch10_ArrrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // add element in array
        arr.add(5);
        arr.add(6);
        arr.add(2);
        arr.add(23);
        System.out.println(arr);

        // get element of array
        int get = arr.get(3);
        System.out.println(get);

        // Add element in between
        arr.add(2, 109);
        System.out.println(arr);

        // Replace element in the array
        arr.set(2, 100);
        System.out.println(arr);

        // Delete the element in the array
        arr.remove(3);
        System.out.println(arr);

        // To find the size of an array
         int size = arr.size();
          System.out.println(size);

        //   To sort the element of array
        Collections.sort(arr);
        System.out.println(arr);
        
    }
}
