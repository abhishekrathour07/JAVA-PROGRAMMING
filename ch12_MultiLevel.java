 class aa{
    void A(){
        System.out.println("A");
    }
}
class bb extends aa{
    void b(){
        System.out.println("B");
     
    }
}
class cc extends bb{
    void b(){
        System.out.println("This is b with c");
    }
    void c(){
        System.out.println("C");
    }
}
class dd extends cc{
    void d(){
        System.out.println("D"); 
    }
}
public class ch12_MultiLevel{
    public static void main(String[] args) {
        dd obj = new dd();
        obj.A();
        obj.b();
        obj.c();
        obj.d();

    }
}