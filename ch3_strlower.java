import java.util.Scanner;
public class ch3_strlower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string to find length");
        String st = input.nextLine();
        System.out.println(st);
        String Ustr = st.toUpperCase();
        System.out.println("Uppercase Letter are ");
        System.out.println(Ustr);
        input.close();
    }
    
}
