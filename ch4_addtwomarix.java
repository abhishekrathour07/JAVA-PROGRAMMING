
import java.util.Scanner;
public class ch4_addtwomarix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j;
        System.out.println("Enter the number of row");
        int r = input.nextInt();
        System.out.println("Enter the number of column");
        int c = input.nextInt();
        int a1[][] = new int[r][c];
        int a2[][] = new int[r][c];
        int sum[][] =new int[r][c];
        System.out.println("Enter the number of element in matrix 1");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                a1[i][j] = input.nextInt();
            }
        }
         System.out.println("Enter the number of element in matrix 2");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                a2[i][j] = input.nextInt();
            }
        }
            System.out.println("Element in matrix 1 are:");
            for(i=0;i<r;i++){
                for(j=0;j<c;j++){
                    System.out.printf("%d\t",a1[i][j]);
                }
                System.out.println("");
            }
             System.out.println("Element in matrix 2 are:");
            for(i=0;i<r;i++){
                for(j=0;j<c;j++){
                    System.out.printf("%d\t",a2[i][j]);
                }
                System.out.println("");
            }
            for(i=0;i<r;i++){
                for(j=0;j<c;j++){
                    sum[i][j] = a1[i][j] + a2[i][j];
                }
            }
             System.out.println("Element in  Sum matrix  are:");
            for(i=0;i<r;i++){
                for(j=0;j<c;j++){
                    System.out.printf("%d\t",sum[i][j]);
                }
                System.out.println("");
            }
            input.close();
            
    }
}
