abstract class Fruit {
    int weight;

    public Fruit() {
        System.out.println("Creation of a fruit");
    }

    public void display() {
        System.out.println("It is A fruit");
    }
}

class Apple extends Fruit {
    public Apple(int p) {
        weight = p;
        System.out.println("creation of an apple of "+weight+" grams ");
    }

    public void display() {
        System.out.println("It is a apple");
    }

    public void displayWeight() {
        System.out.println("The weight of the apple is: "+weight+" grams");
    }
}

class Orange extends Fruit { 

    public Orange(int p) {
        weight=p;
        System.out.println("creation of an Orange of"+weight+" grams ");
    }

    public void display() {
        System.out.println("It's an Orange");
    }

    public void displayWeight() {
        System.out.println("the weight of the Orange is:"+weight+" grams");
    }
}

class Polymorphism {
    public static void main(String[] args){

        // Implicit Upcasting
        Fruit f1 = new Apple(72);  // Apple is upcasted to Fruit
        Fruit f2 = new Orange(80); // Orange is upcasted to Fruit
        
        // Explicit Upcasting (Not needed but shown for clarity)
        Fruit f3 = (Fruit) new Apple(72);  // Explicit upcasting from Apple to Fruit
        Fruit f4 = (Fruit) new Orange(80); // Explicit upcasting from Orange to Fruit

        // Using the upcasted objects
        f1.display();  // Calls Apple's display method
        f2.display();  // Calls Orange's display method

        // Downcasting example: converting a Fruit back to its specific subclass
        // Downcasting Fruit to Orange to call Orange-specific methods
        Orange orange = (Orange) f2;  // Downcasting Fruit (which is actually an Orange) to Orange
        
        // Now you can use Orange-specific methods like displayWeight
        orange.displayWeight();  // Calls Orange's displayWeight() method

        // Another downcasting example: attempting to downcast to Apple
        Apple apple = (Apple) f1;  // Downcasting Fruit (which is actually an Apple) to Apple
        apple.displayWeight();  // Calls Apple’s displayWeight() method

        // Create an array of Fruit (superclass)
        Fruit[] fruits = new Fruit[3];

        // Add different types of fruits (subclass objects)
        fruits[0] = new Apple(72);  // Implicit upcasting happens here
        fruits[1] = new Orange(80);
        fruits[2] = new Apple(95);

        // Iterate through the array and call the display method
        for (Fruit fruit : fruits) {
            fruit.display();  // Calls the subclass-specific display method
        }
    }
}
