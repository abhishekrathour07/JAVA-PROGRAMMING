class test1<t1, t2> {
    t1 obj1;
    t2 obj2;

    test1(t1 obj1, t2 obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void getall() {
        System.out.print(obj1+" , ");
        System.out.println(obj2);
    }
}

public class ch10_generic2 {
    public static void main(String[] args) {
        test1<Integer,String> obj =new test1<>(01,"Abhishek");
        obj.getall();
    }
}
