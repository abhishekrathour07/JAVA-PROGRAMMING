interface a1{
    void display1();
    void display2();
}
interface a2{
    void display1();
   default void display2(){
    System.out.println(" ABHISHEK ");
   }
}
class abhi implements a1,a2{

    @Override
    public void display1() {
       System.out.println("this is display12112");
    }

    @Override
    public void display2() {
              System.out.println("this is display");
    }
    
}
    

public class ch12_ineritance {
public static void main(String[] args) {
    abhi a = new abhi();
    a.display1();
    a.display2();
}
    
}
