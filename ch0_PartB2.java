public class ch0_PartB2 {
    public static void main(String args[]) {
        String city = null;
        try {
            if (city.equals("BANGALORE"))
                System.out.println("Equal");
            else
                System.out.println("Not Equal");
        } catch (Exception e) {
            System.out.println("Null pointer exception caught");
        } finally {
            System.out.println("finally block will be always executed");
        }
    }
}
 