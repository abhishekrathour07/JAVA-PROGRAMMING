import java.util.Scanner;

public class ch2_Evenodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Enter the number to check even or odd");
       int n = input.nextInt();
       if(n%2==0){
        System.out.println("Even Number");
       }
       else {
        System.out.println("Odd  Number");
       }
       input.close();
       
    }

}
