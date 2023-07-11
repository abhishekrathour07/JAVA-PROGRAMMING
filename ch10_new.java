import java.util.ArrayList;

public class ch10_new {

    public static void main(String[] args) {
        ArrayList<Integer> c = new ArrayList<>();
        c.add(20);
        c.add(10);
        c.add(110);
        c.add(230);
        c.add(220);
        c.add(320);
        c.add(201);
        c.add(3,12);
        System.out.println(c);
        c.clear();
        System.out.println(c);

    }
}