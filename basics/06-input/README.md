# Java User Input

The `Scanner` class is used to get user input, and it's found in the `java.util` package.

- Start by importing the Scanner class.
- Create a Scanner object.
- Use it to read input.

## Input Types
| Method        | Description                          |
|---------------|--------------------------------------|
| `nextBoolean()` | Reads a boolean value from the user  |
| `nextByte()`    | Reads a byte value from the user     |
| `nextDouble()`  | Reads a double value from the user   |
| `nextFloat()`   | Reads a float value from the user    |
| `nextInt()`     | Reads an int value from the user     |
| `nextLine()`    | Reads a String value from the user   |
| `nextLong()`    | Reads a long value from the user     |
| `nextShort()`   | Reads a short value from the user    |


### Important Note
Reading a non String value will leave the new line character `\n` in the Scanner (just like in C).  
So we have to clean the input buffer usint the method `nextLine()`
