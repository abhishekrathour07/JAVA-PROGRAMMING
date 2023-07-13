class A11{
    void display(){
System.out.println("Classs a");
    }
}
class b11 extends A11{
    void print(){
    System.out.println("Class B");
}
}
class c11 extends b11{
    void show(){
        System.out.println("Class c");
    }
}
public class practice {
    public static void main(String[] args) {
        c11 obj = new c11();
        // obj.display();
        obj.print();
        obj.show();
    }
}
