// Base class: Vehicle
class Vehicle {
    // Method overloading: Two 'move' methods with different parameters
    void move() {
        System.out.println("The vehicle is moving");
    }

    void move(int speed) {
        System.out.println("The vehicle is moving at " + speed + " km/h");
    }

    // A method that will be overridden in subclasses
    void fuelType() {
        System.out.println("The vehicle uses fuel");
    }
}

// Subclass: Car
class Car extends Vehicle {
    // Method overriding: Overriding 'move' method to provide a specific implementation
    @Override
    void move() {
        System.out.println("The car is driving");
    }

    // Overriding fuelType method
    @Override
    void fuelType() {
        System.out.println("The car uses gasoline");
    }
}

// Subclass: Bike
class Bike extends Vehicle {
    // Method overriding: Overriding 'move' method to provide a specific implementation
    @Override
    void move() {
        System.out.println("The bike is pedaling");
    }

    // Overriding fuelType method
    @Override
    void fuelType() {
        System.out.println("The bike uses human power");
    }
}
