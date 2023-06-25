// concept of OverRiding

class bike {
    int a ;

    void display(int a) {
        System.out.println("Bike is Running at the speed of " + a);
    }
}

class car extends bike {
    int a ;

    void display(int a) {
        System.out.println("Car is Running at the speed of " + a);
    }
}

public class ch6_Overriding {
    public static void main(String[] args) {
        car tata = new car();
        tata.display(60);

    }
}
