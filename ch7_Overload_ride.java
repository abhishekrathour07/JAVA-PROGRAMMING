class file1 {
    void display() {
        System.out.println("Duniya ka best person");

    }

    void display(int a) {
        System.out.println("ABhishek Singh Rathour");
    }

}

class file2 extends file1 {
    @Override
    void display() {
        super.display();
        System.out.println("Abhishek Papa");
    }

}

public class ch7_Overload_ride {
    public static void main(String[] args) {
        file1 s = new file2();
        s.display();
    }
}
