import java.util. Scanner;
public class ch2_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENter the no. to find the multiplication table ");
        int n = input.nextInt();
        System.out.println("The multiplication table of " +n+ " are :" );
        for(int i=1;i<=10;i++){
            System.out.println(n  +" X "+i+ " = " +n*i);
        }
        input.close();
    }
    
}
