// polymorphism Example

public class ch5_functionoverload {
    static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    static int sum(int a, int b, int c1, int d) {
        int c = a + b + c1 + d;
        return c;
    }

    static int sum(int a, int b, int c1) {
        int c = a + b + c1;
        return c;
    }
    static void sum() {
      System.out.println("ABHISHEK");
    }
    


    public static void main(String[] args) {
        System.out.println("Sum of a and b is " + sum(3, 4));
        System.out.println("Sum of a , b and c is " + sum(3, 4, 4));
        System.out.println("Sum of a ,b ,c and d is " + sum(3, 4, 6, 8));
            sum();
    }
}
