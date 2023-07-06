import java.util.Scanner;

class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}

public class ch9_Labprogram4 {
    public static void main(String args[]) throws MyException {
        System.out.println("Enter the employee salary:");
        Scanner input = new Scanner(System.in);
        int pay = input.nextInt();
        if (pay < 10000 || pay > 50000) {
            throw new MyException("salary not in a valid range");
        } else{
            System.out.println("Employee is eligible for 30% hike");
        }
}
}
