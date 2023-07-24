public class ch9_Labprogram11 {
    public static void main(String[] args) {

        try {
            int array[] = new int[-1];
        } catch (Exception obj) {
            System.out.println(obj);
        }
        System.out.println("Exception caught and continue execution");
    }
}
