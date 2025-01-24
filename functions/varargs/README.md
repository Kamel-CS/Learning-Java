# Variable Length Arguments

A feature in Java that allows a method to accept zero or more arguments of the specified type.

### Syntax

```java
returnType methodName(DataType... variableName) {
    // Method body
}
```
---

## Key Points

1. **Varargs is an Array:** Java treats the arguments passed to the method as an array `DataType[]`.
2. **Varargs must be the last argument:** If a method has multiple arguments, varargs must be the last argument.
3. **Zero Arguments:** The Array will be empty if no arguments are passed.
4. **Overloading:** Varargs can be overloaded with methods having different arguments.
5. **Overriding:** Varargs can be overridden with methods having different arguments.
