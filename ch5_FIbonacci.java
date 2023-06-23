import java.util.Scanner;
public class ch5_FIbonacci {
    static int fibo(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fibo(n-1) +fibo(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number to find fibonacci");
        int n = input.nextInt();
        System.out.println("Fibbonacci series is : ");
        for(int i=0;i<n;i++){
            System.out.print(fibo(i) + ",");
        }
        input.close();
    }
}
