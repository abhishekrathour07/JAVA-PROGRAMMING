// Encapsulation program

class MyEmployee {
    private int id;
    private String name;
    int sellery;

    public void setid(int i) {
        this.id = i;
    }

    public int getid() {
        return id;
    }

    public void setname(String n) {
        this.name = n;
    }

    public String getname() {
        return name;
    }

    public void setsellary(int sellery) {
        this.sellery = sellery;

    }

    public int getsellery() {
        return sellery;
    }
}

public class ch6_gettersetter {

    public static void main(String[] args) {
        MyEmployee abhi = new MyEmployee();
        abhi.setid(101);
        abhi.setname("Abhishek");
        abhi.setsellary(123);
        System.out.println("The Salary of employee is : ");
        System.out.println(abhi.getid());
        System.out.println(abhi.getname());
        System.out.println(abhi.getsellery());

    }

}
