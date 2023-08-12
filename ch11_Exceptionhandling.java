// Example of exception handling.........

public class ch11_Exceptionhandling {
    public static void divide(int nume, int deno) throws CustomException {
        if (deno == 0) {
            throw new CustomException("Denominator cannot be zero");
        }
        int result = nume / deno;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        try {
            int n = 10;
            int d = 0;
            divide(n, d);
        } catch (CustomException ce) {
            System.out.println(ce);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        } finally {
            System.out.println("Finally block executed");
        }
    }
}

// Custom Exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
