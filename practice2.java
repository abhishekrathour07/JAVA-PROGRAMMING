class aaaa {
    void display() {
        System.out.println(this);
    }
}

public class practice2 {
    public static void main(String[] args) {
        aaaa obj = new aaaa();
        System.out.println(obj);
        obj.display();
    }
}