import java.util.Scanner;
public class ch3_stringbegin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter the String ");
        String name = input.nextLine();
        // String name = input.next(); --> This is for only one string.
        System.out.println(name);
        input.close();
    }
}
