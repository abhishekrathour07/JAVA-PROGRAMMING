import java.util.Scanner;
public class ch14_online8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double l = sc.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double b = sc.nextDouble();

        double area = l * b;
        // d =under Root w^2 + b^2
        double diagonal = Math.sqrt(Math.pow(l, 2) + Math.pow(b, 2));
        double perimeter = 2 * (l + b);

        System.out.println("Length: " + l);
        System.out.println("Breadth: " + b);
        System.out.println("Area: " + area);
        System.out.println("Diagonal Length: " + diagonal);
        System.out.println("Perimeter: " + perimeter);

        sc.close();
    }
}


