class student {
    int id;
    String name;
    double salery;

    student(int id, String name, double d) {
        this.name = name;
        this.id = id;
        salery = d;
    }

}

public class ch8_Equals {
    public static void main(String[] args) {
        student s1 = new student(101, "abhishek", 60000.3);
        student s2 = new student(101, "abhishek", 60000.3);
        System.out.println(s2.equals(s1));

    }
}
