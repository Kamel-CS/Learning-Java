# Polymorphism in Java
In OOP, Polymorphism means that one method can work in multiple ways, depending on the object that is working upon.

Two main types of polymorphism in OOP:
- **Compile-time polymorphism (Static polymorphism)**
This is achieved through method **overloading** (same method name but different parameters).
The method that gets executed is determined at compile time, based on the arguments passed to the method.

- **Runtime polymorphism (Dynamic polymorphism)**
This is achieved through method **overriding**, which allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
The method to be executed is determined at runtime based on the object type, even if the object is referenced as the superclass type.
