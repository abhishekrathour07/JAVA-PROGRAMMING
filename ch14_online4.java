/*import java.util.Scanner;

public class ch14_online4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter how much even no you want to find ");
         int n  = sc.nextInt();
         n =n*2;
        for (int i = 2; i <= n; i=i+2) {
            System.out.println(i);
        }
        sc.close();
    }
}
*/
import java.util.Scanner;
public class ch14_online4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how much even no you want to find ");
        int n=sc.nextInt();
  for(int i=1;i<n;i++)
  {
   System.out.println(2*i);
  }
  sc.close();
}
}
