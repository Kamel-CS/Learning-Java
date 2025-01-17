# Java Inheritance
Inheritance is a mechanism in OOP where a class (**subclass/child/derived class**) inherits properties and behaviors from another class (**superclass/parent class**).
- **Purpose:** Reuse code and establish a relationship between classes.
---

## Other Concepts Used
1. **Protected Keyword**
The `protected` access modifier allows a member to be accessed within the same package and by subclasses, even if they are in a different package.
  - **Why Used:**
    - In the `BankAccount` class, balance is declared protected to let derived classes like `StudentAccount` directly access and manipulate it.

2. **Encapsulation**
Encapsulation restricts direct access to some of an object's components, typically by using private fields and providing public `getter`/`setter` methods.
  - **Application:**
    - The `accountHolder` and `accountNumber` fields in BankAccount are private.
    - Getter methods (`getAccountHolder` and `getAccountNumber`) are provided to access their values

3. **Overriding Methods**
Overriding allows a subclass to provide a specific implementation for a method already defined in its superclass.
  - **Application:**
    - Since all classes in Java inherits from the **Object** class, which provides a default implementation of the `toString` method. Overriding it allow to define a more readable version of it.
    - The `withdraw` method in `StudentAccount` overrides the `withdraw` method in `BankAccount` to change behavior (no fees for students).

4. **Super Keyword**
The `super` keyword is used to call the parent class's constructor or methods.
  - **Application:**
    - The constructor of `StudentAccount` uses `super` to invoke the constructor of `BankAccount`.
    - The `toString` method of `StudentAccount` uses `super` to invoke the `toString` method of its superclass.
