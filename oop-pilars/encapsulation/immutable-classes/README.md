# Immutable Classes in Java

An immutable class is a class whose objects cannot be modified after they are created. Immutable classes provide **thread-safety**, **security**, and **performance** benefits, as they prevent unintended changes to objects.

### Key Characteristics of an Immutable Class:
1. The class is declared as `final` to prevent subclassing. 
    - **Note**: The `final` keyword on the class prevents it from being subclassed, ensuring that its behavior cannot be changed by inheritance. This does **not** imply that all members of the class are inherently immutable. It only ensures the class cannot be extended.

2. All fields are `private` and `final`.
    - **Note**: The `final` keyword applied to fields ensures that their values cannot be reassigned after initialization. This is critical for immutability, ensuring that once an object is created, its state cannot change.

3. No setter methods are provided, preventing modification of fields.

4. Fields are initialized in the constructor and not modified afterward.

### **Final** vs **Immutable**
- A `final` class can be immutable, but being `final` does **not** guarantee immutability. For instance, a `final` class can still expose mutable fields or setter methods, which could allow modifications.
  
- **Immutability** is a **design choice** made by restricting how the class and its fields behave, regardless of whether the class itself is `final`.

