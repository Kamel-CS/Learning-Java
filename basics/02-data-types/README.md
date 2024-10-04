# Data Types

Data types are divided into two groups:
- **Primitive data types**: `byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, `char`.
- **Non-primitive data types**: `Strings`, `Arrays`, `Classes`.


## Primitive Data Types in Java

Java has **8 primitive data types**:

| Data Type | Size (bytes) | Range (For Numbers)                  |
|-----------|--------------|--------------------------------------|
| byte      | 1            | [-128 to 127]                        |
| short     | 2            | [-32,768 to 32,767]                 |
| int       | 4            | [-2,147,483,648 to 2,147,483,647]   |
| long      | 8            | [-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807] |
| float     | 4            | Approximately ±3.40282347E+38 (6-7 significant decimal digits) |
| double    | 8            | Approximately ±1.79769313486231570E+308 (15 significant decimal digits) |
| char      | 2            | 0 to 65,535 (Unicode characters)    |
| boolean   | 1            | true or false                        |

#### Notes:
- The range for numeric types is calculated using the formula:  
  `[-2^(n-1) ; 2^(n-1) - 1]`  
  where **n** is the size of the type in bytes.
  


### Characters

- `char` data type must be surrounded by single quotes. We can assing ASCII values to a `char`.
- `String` data type must be surrounded by double quotes.
