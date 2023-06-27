import java.util.Scanner;

public class ch04_AreaCalculator {


    
    public static int calculateArea(int side) {
        return side * side;
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static float calculateArea(int base, int height) {
        return (float) (0.5 * base * height);
    }

    public static float calculateArea(float length, float width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Your choice here : ");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");
        System.out.println("4. Rectangle");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the length of a side: ");
                int side = scanner.nextInt();
                System.out.println("Area of square: " + calculateArea(side));
                break;
            case 2:
                System.out.print("Enter the radius: ");
                double radius = scanner.nextDouble();
                System.out.println("Area of circle: " + calculateArea(radius));
                break;
            case 3:
                System.out.print("Enter the base length: ");
                int base = scanner.nextInt();
                System.out.print("Enter the height: ");
                int height = scanner.nextInt();
                System.out.println("Area of triangle: " + calculateArea(base, height));
                break;
            case 4:
                System.out.print("Enter the length: ");
                float length = scanner.nextFloat();
                System.out.print("Enter the width: ");
                float width = scanner.nextFloat();
                System.out.println("Area of rectangle: " + calculateArea(length, width));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

}
