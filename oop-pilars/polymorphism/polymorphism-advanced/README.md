# Polymorphism in Java

This repository demonstrates key concepts of **Polymorphism** in Java using examples of `Fruit`, `Apple`, and `Orange` classes.

## Key Concepts

### 1. Instantiation of Subclasses
When a subclass is instantiated, the **parent class constructor** is called first to initialize the inherited properties.  
This ensures the base class is properly constructed before the subclass-specific logic runs.

Example:
```java
Apple p = new Apple(72);
```
```
Creation of a fruit
Creation of an apple of 72 grams
```

#### 2. Upcasting
Upcasting allows treating subclass objects as their parent type, enabling generalization.
Implicit Upcasting occurs automatically when assigning a subclass to a superclass reference.
Explicit Upcasting is possible but unnecessary.

Example:
```java
Fruit f1 = new Apple(72);  // Implicit upcasting
Fruit f2 = (Fruit) new Orange(80);  // Explicit upcasting
```

#### 3. Downcasting
Downcasting converts a parent type reference back into a subclass type, allowing access to subclass-specific methods.
This requires an explicit cast and must be used with care to avoid ClassCastException.

Example:
```java
Fruit f = new Apple(72);
((Apple) f).displayWeight();
```

### 4. Arrays with Polymorphism
An array of the parent type (Fruit[]) can hold objects of any subclass.
Java automatically performs implicit upcasting, and subclass methods are invoked dynamically.

Example:
```java
Fruit[] fruits = {new Apple(72), new Orange(80)};
for (Fruit fruit : fruits) {
    fruit.display();  // Calls the overridden `display` method of the actual object
}
```
```
Creation of a fruit
Creation of an apple of 72 grams
Creation of a fruit
Creation of an orange of 80 grams
It is an apple
It's an Orange
```

### 5. Using `instanceof` and Downcasting
In some cases, you may want to invoke subclass-specific methods that are not part of the parent class.
The instanceof operator is used to check the object type, and downcasting is done to call subclass-specific methods.

Example:
```java
for (Fruit fruit : fruits) {
    fruit.display();  // Calls the overridden `display` method specific to the object type
    if (fruit instanceof Apple) {
        // Downcast to Apple to call displayWeight
        ((Apple) fruit).displayWeight();
    } else {
        // Downcast to Orange to call displayWeight
        ((Orange) fruit).displayWeight();
    }
}
```
This approach explicitly checks the type of each fruit in the array and calls the appropriate method (`displayWeight`) for each subclass (`Apple` or `Orange`).
