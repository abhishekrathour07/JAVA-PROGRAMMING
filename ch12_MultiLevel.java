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
    void c(){
        System.out.println("C");
    }
}
class dd extends cc{
    void d(){
        System.out.println("D"); //--> then what is difference between both. multilevel and multiple......
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