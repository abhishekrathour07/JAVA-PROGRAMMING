import java.util.Scanner;

public class ch4_sumeven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i, n;
            int sum=0;
            System.out.println("Enter the even number to find the sum");
            n = sc.nextInt();

            for (i = 1; i < n; i++) {
                n = sc.nextInt();
                if(n%2==0){
                    sum  +=n;
                }
            }
            System.out.println("Sum of n even numbers are " +sum);
            sc.close();
        }
    }


}
