// Inheritance example
class base {
    public int a = 10;

    void display() {
        System.out.println("This is Base Class");
    }
}

class derived extends base {
    int b = 20;

    void display() {
        System.out.println("This is derived Class");
    }
}

public class ch6_inheritance {
    public static void main(String[] args) {
        System.out.println("INHERITENCE");
        derived d = new derived();
        System.out.println(d.a);
        System.out.println(d.b);
        d.display();
    }
}
