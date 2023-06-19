import java.util.Scanner;

public class ch4_matrixmul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numcer of rows for your 1st matrix");
        int r1 = sc.nextInt();
        System.out.println("enter the numcer of colums for your 1st matrix");
        int c1 = sc.nextInt();
        System.out.println("enter the numcer of rows for your 2nd matrix");
        int r2 = sc.nextInt();
        System.out.println("enter the numcer of rows for your 2nd matrix");
        int c2 = sc.nextInt();
        int mat1[][] = new int[r1][c1];
        int mat2[][] = new int[r2][c2];
        if (c1 == r2) {
            System.out.println("enter the array elements of your 1st matrix");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    mat1[i][j] = sc.nextInt();
                }
            }
            System.out.println("enter the array elements of your 2nd matrix");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    mat2[i][j] = sc.nextInt();
                }
            }
            System.out.println("your first matrix is as follow");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.printf("%d\t", mat1[i][j]);
                }
                System.out.println("");
            }
            System.out.println("your second matrix is");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.printf("%d\t", mat2[i][j]);
                }
                System.out.println("");
            }
            int res[][] = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    res[i][j] = 0;
                    for (int k = 0; k < r2; k++) {
                       res[i][j] =res[i][j] + mat1[i][k] * mat2[k][j];
                    }
                }
            }
            System.out.println("=======================");
            System.out.println("your final matrix is");
            System.out.println("========================");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.printf("%d\t", res[i][j]);
                }
                System.out.println("");
            }

        } else {
            System.out.println("matrix not possible for your given input please input");
        }
            sc.close();
    }

}