// Interface defining a basic structure for vehicles
interface Vehicle {
    void start();
    void stop();
}

// Interface defining additional features for cars
interface Car extends Vehicle {
    void accelerate();
}

// Interface defining additional features for boats
interface Boat extends Vehicle {
    void sail();
}

// Class implementing Car interface
class Sedan implements Car {
    @Override
    public void start() {
        System.out.println("Sedan starting...");
    }

    @Override
    public void stop() {
        System.out.println("Sedan stopping...");
    }

    @Override
    public void accelerate() {
        System.out.println("Sedan accelerating...");
    }
}

// Class implementing Boat interface
class Yacht implements Boat {
    @Override
    public void start() {
        System.out.println("Yacht starting...");
    }

    @Override
    public void stop() {
        System.out.println("Yacht stopping...");
    }

    @Override
    public void sail() {
        System.out.println("Yacht sailing...");
    }
}

// Class demonstrating hybrid inheritance
class HybridVehicle implements Car, Boat {
    @Override
    public void start() {
        System.out.println("HybridVehicle starting...");
    }

    @Override
    public void stop() {
        System.out.println("HybridVehicle stopping...");
    }

    @Override
    public void accelerate() {
        System.out.println("HybridVehicle accelerating...");
    }

    @Override
    public void sail() {
        System.out.println("HybridVehicle sailing...");
    }
}

public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        Yacht yacht = new Yacht();
        HybridVehicle hybridVehicle = new HybridVehicle();

        sedan.start();
        sedan.accelerate();
        sedan.stop();

        yacht.start();
        yacht.sail();
        yacht.stop();

        hybridVehicle.start();
        hybridVehicle.accelerate();
        hybridVehicle.sail();
        hybridVehicle.stop();
    }
}
