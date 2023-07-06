class garbage {

}
public class ch8_Garbage {
    public static void main(String[] args) {
        garbage g = new garbage();
        g = null;  // JAva perform automatically memory management here
        // garbage value is java is nothing but inreference object
        System.out.println(g);
    }
}
