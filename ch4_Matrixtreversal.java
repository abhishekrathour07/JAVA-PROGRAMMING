import java.util.Scanner;
public class ch4_Matrixtreversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,j;
        System.out.println("Enter the no. of rows in Matrix");
        int r = input.nextInt();
        System.out.println("Enter the no. of column in matrix");
        int c = input.nextInt();
    
        System.out.println("Enter the element in Matrix");
        int[][] a = new int[r][c];
         for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                a[i][j] = input.nextInt();

            }
         }
         System.out.println("Elements in matrix are :");
         for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.printf("%d\t",a[i][j]);
            }
            System.out.println("\n");
         }
    }
}
