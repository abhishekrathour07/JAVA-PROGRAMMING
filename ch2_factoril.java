import java.util.Scanner;
public class ch2_factoril {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the no.to find factorial");
    int n = input.nextInt();
    int fact =1;
    for(int i=1;i<=n;i++){
        fact *= i;
    }
    System.out.println("Factorial of " +n + " is "+fact);
    input.close();
}
}
