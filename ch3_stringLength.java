import java.util.Scanner;
public class ch3_stringLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string to find length");
        String st = input.nextLine();
        System.out.println(st);
        int l = st.length();
        System.out.println("Length = " +l);
        input.close();
    }
    
}
