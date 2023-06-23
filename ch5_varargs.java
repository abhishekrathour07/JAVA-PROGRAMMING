public class ch5_varargs {

    static int sum(int... array) {
        int sum = 0;
        for (int a : array) {
            sum = sum + a;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of a and b is " + sum(3, 4));
        System.out.println("Sum of a , b and c is " + sum(3, 4, 4));
        System.out.println("Sum of a ,b ,c and d is " + sum(3, 4, 6, 8));

    }

}
