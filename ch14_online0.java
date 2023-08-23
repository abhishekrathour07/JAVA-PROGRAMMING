// make a class FirstClass and use a string name variable two integer and make five function and makes this variable in use ;
class func {
    int a = 10;
    int b = 20;
    String name = "Abhishek Rathour";

    void sum1() {
        System.out.println("The value of a + b = " + (a + b));
    }

    void sub1() {
        System.out.println("The value of a - b = " + (a - b));
    }

    int sum2() {
        return a + b;
    }

    int sub2() {
        return a - b;
    }

    void display() {
        System.out.println("Hello " + name + " have a nice day!");
    }
}

public class ch14_online0 {
    public static void main(String[] args) {
        func f = new func();
        f.sum1();
        f.sub1();
        System.out.println("The value of a - b = " + f.sub2());
        System.out.println("The value of a + b = " + f.sum2());
        f.display();
    }

}