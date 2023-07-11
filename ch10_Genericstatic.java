
public class ch10_Genericstatic {
    static <T> void genricdisplay(T obj) {
        System.out.println("Generic name is  " + obj);
    }

    public static void main(String[] args) {
        genricdisplay(2);
        genricdisplay("Abhishek singh rathour");
        genricdisplay(9.4);

    }
}
