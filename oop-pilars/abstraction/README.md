# Abstraction in Java

Abstraction allows you to focus on **essential characteristics** while hiding the irrelevant details. In Java, abstraction can be achieved using **abstract classes** and **interfaces**.

---

## **Types of Abstraction in Java**

### **1. Abstract Classes**
An abstract class is a class that **cannot be instantiated** on its own. It can contain:
- **Abstract methods**: Methods without implementation.
- **Concrete methods**: Methods with implementation.
- **Fields and constructors**, just like concrete classes.

#### **Key Points:**
- Must use the `abstract` keyword to define an abstract class.
- Abstract methods must be implemented by the first concrete subclass.
- Allows shared behavior via concrete methods, while enforcing some rules via abstract methods.

#### **Use Case:**
When you want to:
- Share some functionality across multiple subclasses.
- Enforce that subclasses implement certain methods.

---

### **2. Interfaces**
An interface in Java is a **blueprint** for a class that specifies a contract a class must follow. It can contain:
- **Abstract methods**: Declared implicitly as `public abstract`.
- **Default methods**: Concrete methods with the `default` keyword.
- **Static methods**: Associated with the interface, not instances.
- **Private methods**: Helper methods for use within the interface.
- **Constants**: Fields that are implicitly `public static final`.

#### **Key Points:**
- **No constructors**: Interfaces cannot be instantiated directly.
- A class can **implement multiple interfaces**.
- Fields are implicitly `public`, `static`, and `final`.
- Abstract methods don’t require the `abstract` keyword as they are abstract by default.

#### **2.1. Default Methods**
- Provide a reusable, concrete implementation that all implementing classes can use or override.
- Declared with the `default` keyword (not an access modifier).

#### **2.2. Static Methods**
- Belong to the interface itself, not to any instance of the class.

#### **2.3. Private Methods**
- Used to modularize code within the interface.
- Cannot be accessed by implementing classes.

#### **Use Case:**
- Use interfaces when you want to define a contract that multiple unrelated classes can implement.

---

## **Key Concepts**

### **1. Single Inheritance**
A class can extend only **one class**, whether it's abstract or concrete. This ensures simplicity in the class hierarchy.

### **2. Multiple Inheritance**
Achieved through interfaces:
- A class can implement multiple interfaces simultaneously.
- Resolves the diamond problem by requiring explicit method overrides.

### **3. Combining Single & Multiple Inheritance**
A class can inherit from a single class and implement multiple interfaces at the same time.
```java
class Dog extends LivingBeing implements Animal, Mammal {
    // Code for the Dog class
}
