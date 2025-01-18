public class Main {
    public static void main(String[] args) {
        // Demonstrating method overloading and overriding

        // Using method overloading (same method name, different parameters)
        Vehicle myVehicle = new Vehicle();
        myVehicle.move();           // Calls move() with no arguments
        myVehicle.move(50);         // Calls move() with a speed parameter

        // Demonstrating runtime polymorphism (method overriding)
        Vehicle myCar = new Car();
        myCar.move();               // Calls the overridden method in Car
        myCar.fuelType();           // Calls the overridden method in Car

        Vehicle myBike = new Bike();
        myBike.move();              // Calls the overridden method in Bike
        myBike.fuelType();          // Calls the overridden method in Bike
    }
}
