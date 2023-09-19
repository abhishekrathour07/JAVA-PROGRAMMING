public class ch0_PartB1 {
    public static void main(String[] args) {

        try {
            int array[] = new int[-1];
        } catch (Exception obj) {
            System.out.println(obj);
        }
        System.out.println("Exception caught and continue execution");
    }
}
