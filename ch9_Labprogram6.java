import java.util.Scanner;
class addsub {
    int n1, n2;

    addsub(int x, int y) {
        n1 = x;
        n2 = y;
    }

    int add() {
        return n1 + n2;
    }

    int sub() {
        return n1 - n2;
    }
}
class muldiv extends addsub {
    muldiv(int x, int y) {
        super(x, y);
    }

    int mul() {
        return n1 * n2;
    }

    int div() {
        return n1 / n2;
    }
}
public class ch9_Labprogram6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int x = sc.nextInt();
        System.out.println("Enter the second Number");
            int y = sc.nextInt();
        muldiv m = new muldiv(x, y);
        System.out.println("Addition of two numbers is " + m.add());
        System.out.println("Subtraction of two numbers is " + m.sub());
        System.out.println("Multiplication of two numbers is " + m.mul());
        System.out.println("Division of two numbers is " + m.div());
            sc.close();
    }

}
