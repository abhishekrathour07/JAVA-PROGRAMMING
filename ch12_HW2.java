// program of quadratic equation 

import java.util.Scanner;

public class ch12_HW2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a, b, c, r2, r1;
        double disc;

        System.out.println("Enter three Co-efficient ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if (a == 0)
            System.out.println("Not a Quadratic Equation ");
        else {
            disc = b * b - 4.0 * a * c;
            if (disc < 0.0) {
                System.out.println("Complex Roots");
                disc = -disc;
                r1 = -b / (2.0 * a);
                r2 = Math.sqrt(disc);
                System.out.println("\nDiscriminant = " + disc);
                System.out.println("\nRoot1 = " + r1);
                System.out.println("\nRoot2 = " + r2);
            } else if (disc == 0.0) {
                System.out.println("\nDiscriminant = " + disc);
                System.out.println("\nReal and Equal Roots");
                r1 = -b / (2.0 * a);
                System.out.println("\nRoot1 = " + r1 + " \nRoot2 = %f " + r1);
            } else {
                System.out.println("\nDiscriminant = " + disc);
                System.out.println("\nReal and Unequal Roots \n");
                r1 = (-b + Math.sqrt(disc)) / (2.0 * a);
                r2 = (-b - Math.sqrt(disc)) / (2.0 * a);
                System.out.println("\nRoo1 = " + r1 + "Root2 = " + r2);

            }
        }
        sc.close();
    }

}
