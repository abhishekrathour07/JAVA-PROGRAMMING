class test<t> {
    t obj;

    void setdata(t obj) {
        this.obj = obj;
    }

    t getdata() {
        return obj;
    }
}

public class ch10_generic1 {
    public static void main(String[] args) {
        test<Integer> obj = new test<>();
        obj.setdata(10);
        System.out.println("Integer function is " + obj.getdata());
        test<String> obj1 = new test<>();
        obj1.setdata("Abhishek");
        System.out.println("String function is " + obj1.getdata());
    }
}
