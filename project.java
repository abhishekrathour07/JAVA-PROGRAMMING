import java.util.Scanner;

class BankAccount{
    double bal;
    double prevTrans;
    String customerName;
    String customerId;

    BankAccount(String customerName,String customerId){
        this.customerName=customerName;
        this.customerId=customerId;
    }

    void deposit(double amount){
        if(amount!=0){
            bal+=amount;
            prevTrans=amount;
        }
    }

    void withdraw(double amt){
        if(amt!=0 && bal>=amt){
            bal-=amt;
            prevTrans=-amt;
        }
        else if(bal<amt){
            System.out.println("Bank balance insufficient");
        }
    }

    void getPreviousTrans(){
        if(prevTrans>0){
            System.out.println("Deposited: "+prevTrans);
        }
        else{
            System.out.println("No transaction occured");
        }
    }

    void menu(){
        char option;
        Scanner sc=new Scanner(System.in);
          System.out.println("Welcome to Reserve Bank Of India");
        System.out.println("Welcome "+customerName);
        System.out.println("Your ID:"+customerId);
        
        while(true){
            System.out.println("\n");
            System.out.println("a) Check Balance");
            System.out.println("b) Deposit Amount");
            System.out.println("c) Withdraw Amount");
            System.out.println("d) Previous Transaction");
            System.out.println("e) Exit");
            System.out.println("****************");
            System.out.println("Choose an option");
            option=sc.next().charAt(0);
            System.out.println("\n");

            switch (option){
                case 'a':
                    System.out.println("......................");
                    System.out.println("Balance ="+bal);
                    System.out.println("......................");
                    System.out.println("\n");
                    break;
                case 'b':
                    System.out.println("......................");
                    System.out.println("Enter a amount to deposit :");
                    System.out.println("......................");
                    double amt=sc.nextDouble();
                    deposit(amt);
                    System.out.println("\n");
                    break;
                case 'c':
                    System.out.println("......................");
                    System.out.println("Enter a amount to Withdraw :");
                    System.out.println("......................");
                    double amtW=sc.nextDouble();
                    withdraw(amtW);
                    System.out.println("\n");
                    break;
                case 'd':
                    System.out.println("......................");
                    System.out.println("Previous Transaction:");
                    getPreviousTrans();
                    System.out.println("......................");
                    System.out.println("\n");
                    break;

                case 'e':
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
public class project {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your 'Name' and 'CustomerId' to access your Bank account:");
        String name=sc.nextLine();
        String customerId=sc.nextLine();
        BankAccount obj1=new BankAccount(name,customerId);
        obj1.menu();
    }
}
