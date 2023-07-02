public class ch8_tryCatch {
    public static void main(String[] args) {
        int a =10; 
        int b =4;
        try {
            int c =a/b;
            System.out.println("the value of c = "+c);
            
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
