interface Movable {
    void move();
}

interface Soundable extends Movable {
    void makeSound();
}

// Class representing a generic animal
class Animal2 {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog2 extends Animal2 implements  Soundable {
    @Override
    public void move() {
        System.out.println("Dog is running.");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog is barking.");
    }
}

public class ch13_hybridIn {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        dog.eat();
        dog.move();
        dog.makeSound();
    }
}
