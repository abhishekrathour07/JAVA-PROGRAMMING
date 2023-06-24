class inherit {
    inherit() {
        System.out.println("This is inherit class");
    }

    inherit(int x) {
        System.out.println("The value of x is " + x);
    }
}

class inherit1 extends inherit {
    inherit1() {
        System.out.println("This is inherit 1 class");
    }

    inherit1(int x, int y) {
        super(x);
        System.out.println("The value of y is " + y);
    }
}

class inherit2 extends inherit1 {
    inherit2() {
        System.out.println("This is inherit 2 class");

    }

    inherit2(int x, int y, int z) {
        super(x, y);
        System.out.println("The value of z is " + z);
    }

}

public class ch6_INherit {
    public static void main(String[] args) {
        new inherit2(1, 2, 3);
        

    }

}
