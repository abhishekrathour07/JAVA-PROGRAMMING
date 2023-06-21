class Employee {
    int id;
    String name;
    int sallery;

    void getdetail() {
        System.out.println("Employee Details");
        System.out.println(id);
        System.out.println(name);
        System.out.println(sallery);
    }

}

public class ch6_customclassOOPS {
    public static void main(String[] args) {
        Employee sn1 = new Employee();
        Employee sn2 = new Employee();
        sn1.id = 101;
        sn1.name = "Abhishek singh";
        sn1.sallery = 25000;
        sn2.id = 102;
        sn2.name = "Rohit singh";
        sn2.sallery = 25000;
        sn1.getdetail();
        sn2.getdetail();
    }
}
