interface Movable {
    void move();
}

interface Soundable extends Movable {
    void makeSound();
}

// Class representing a generic animal
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal implements Movable, Soundable {
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
        Dog dog = new Dog();
        dog.eat();
        dog.move();
        dog.makeSound();
    }
}
