import java.util.ArrayList;
import java.util.Scanner;

class BankAccount {
    double bal;
    double Trans;
    ArrayList<String> customerName;
    ArrayList<Integer> customerId;

    BankAccount(ArrayList<String> name, ArrayList<Integer> customerId) {
        this.customerName = name;
        this.customerId = customerId;
    }

    void deposit(double amount) {
        if (amount != 0) {
            bal += amount;
            Trans = amount;
        }
    }

    void withdraw(double amt) {
        if (amt != 0 && bal >= amt) {
            bal -= amt;
            Trans = -amt;
        } else if (bal < amt) {
            System.out.println("Bank balance insufficient");
        }
    }

    void getPreviousTrans() {
        if (Trans > 0) {
            System.out.println("Deposited: " + Trans);
        } else {
            System.out.println("No transaction occured");
        }
    }

    void menu() {
        char option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Reserve Bank Of India");
        System.out.println("Welcome " + customerName);
        System.out.println("Your ID:" + customerId);

        while (true) {
            System.out.println("\n");
            System.out.println("1) Check Balance");
            System.out.println("2) Deposit Amount");
            System.out.println("3) Withdraw Amount");
            System.out.println("4) Previous Transaction");
            System.out.println("5) Exit");
            System.out.println("****************");
            System.out.println("Choose an option");
            option = sc.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 1:
                    System.out.println("......................");
                    System.out.println("Balance =" + bal);
                    System.out.println("......................");
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("......................");
                    System.out.println("Enter a amount to deposit :");
                    System.out.println("......................");
                    double amt = sc.nextDouble();
                    deposit(amt);
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("......................");
                    System.out.println("Enter a amount to Withdraw :");
                    System.out.println("......................");
                    double amtW = sc.nextDouble();
                    withdraw(amtW);
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("......................");
                    System.out.println("Previous Transaction:");
                    getPreviousTrans();
                    System.out.println("......................");
                    System.out.println("\n");
                    break;

                case 5:
                    System.out.println("......................");
                    System.out.println("Thank you for using our banking services");
                    break;
                default:
                    System.out.println("Choose a correct option to proceed");
                    break;
            }

        }

    }

}

public class BankProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        ArrayList<Integer> customerId = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        System.out.println("Enter the number of Customer in Your bank");
        
        int n = sc.nextInt();
        for (i = 0; i < n; i++) {
            System.out.printf("Enter the CustomerId of the Customers[%d] :- ", i + 1);
            customerId.add(i, sc.nextInt());
            System.out.printf("Enter the name of the Customers[%d] :- ", i + 1);
            name.add(i, sc.next());

        }

        BankAccount obj1 = new BankAccount(name, customerId);
        obj1.menu();
}
}
