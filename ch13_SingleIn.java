class Animal3 {int i;
    void eat() {
        System.out.println("eating...");
    }
}

class Dog3 extends Animal3 {
    void bark() {
        System.out.println("barking...");
    }
}

class ch13_SingleIn {
    public static void main(String args[]) {
        Dog3 d = new Dog3();
        d.bark();
        d.eat();
    }
}