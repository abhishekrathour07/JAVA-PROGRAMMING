import java.util.Scanner;

public class electicbill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter consumer name: ");
        String consumerName = scanner.nextLine();

        System.out.print("Enter previous month reading: ");
        double previousMonthReading = scanner.nextDouble();

        System.out.print("Enter current month reading: ");
        double currentMonthReading = scanner.nextDouble();

        double unitsConsumed = currentMonthReading - previousMonthReading;

        double totalAmount = calculateBill(unitsConsumed);

        System.out.println("\nElectricity Bill");
        System.out.println("Consumer: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Amount: $" + totalAmount);

        scanner.close();
    }

    public static double calculateBill(double units) {
        double totalAmount = 0;

        if (units <= 100) {
            totalAmount = units * 0.1;
        } else if (units <= 200) {
            totalAmount = 100 * 0.1 + (units - 100) * 0.2;
        } else if (units <= 300) {
            totalAmount = 100 * 0.1 + 100 * 0.2 + (units - 200) * 0.3;
        } else {
            totalAmount = 100 * 0.1 + 100 * 0.2 + 100 * 0.3 + (units - 300) * 0.4;
        }

        return totalAmount;
    }
}
