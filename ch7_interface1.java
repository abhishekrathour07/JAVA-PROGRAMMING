interface e1 {
       int a =10;    
    void display();
    void display2();

    default void display3() {
        System.out.println("This is display 3 method");
    }

}

interface e2 {
    void show();
}

interface e3 extends e1,e2 {
    void print();
}
  
class A {
    void Main() {
        System.out.println("This is class A");
    }
}

class B extends A implements e3 {

    @Override
    public void print() {
        System.out.println("This is Print method");
    }

    @Override
    public void show() {
        System.out.println("This is show method");
    }

    @Override
    public void display() {
        System.out.println("This is display method");
    }

    @Override
    public void display2() {
        System.out.println("This is display2 method");
    }
}

public class ch7_interface1 {
    public static void main(String[] args) {
        B b1 = new B();
        System.out.println(b1.a);
        b1.display();
        b1.display3();
    }
}