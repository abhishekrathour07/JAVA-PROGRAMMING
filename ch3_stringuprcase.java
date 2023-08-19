import java.util.Scanner;

public class ch3_stringuprcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string to find length");
        String st = input.nextLine();
        System.out.println(st);
        String lstr = st.toLowerCase();
        String ustr = st.toUpperCase();

        System.out.println("String in lowercase ");
        System.out.println(lstr);
        
        System.out.println(ustr);

        input.close();
    }

}
