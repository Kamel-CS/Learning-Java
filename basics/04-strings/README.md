# Strings in Java
A string is a set of characters surrounded by double quotes.
   
## Strings Methods
| Java Method                  | Explanation                                                        | Python Equivalent           |
|------------------------------|--------------------------------------------------------------------|-----------------------------|
| `length()`                    | Returns the number of characters in the string.                    | `len()`                     |
| `charAt(index)`               | Returns the character at the specified index.                      | `text[index]`               |
| `substring(start, end)`       | Returns a substring between the specified indices (start inclusive, end exclusive). | `text[start:end]`           |
| `equals(str)`                 | Compares two strings for content equality.                         | `==`                        |
| `equalsIgnoreCase(str)`       | Compares two strings ignoring case differences.                    | `text1.lower() == text2.lower()` |
| `startsWith(prefix)`          | Checks if the string starts with the specified prefix.              | `text.startswith()`         |
| `endsWith(suffix)`            | Checks if the string ends with the specified suffix.                | `text.endswith()`           |
| `contains(sequence)`          | Checks if the string contains the specified sequence.               | `in`                        |
| `indexOf(str)`                | Returns the index of the first occurrence of the specified substring or `-1` if not found. | `find()`                    |
| `toUpperCase()`               | Converts all characters to uppercase.                              | `upper()`                   |
| `toLowerCase()`               | Converts all characters to lowercase.                              | `lower()`                   |
| `trim()`                      | Removes leading and trailing whitespace.                           | `strip()`                   |
| `replace(target, replacement)`| Replaces occurrences of the target string with the replacement string. | `replace()`                 |

#### Note
- When using methods, always ensure that you use double quotes (`" "`)
- Single quotes can be used for single characters, but not in string methods.
---

## Strings Concatenation
Java use the `+` operator for both addition and concatenation.
#### Rule
- `String` + `anyType` = `String`: Java will convert the non `String` operand to `String`.


### Escape characters
| Escape Sequence | Description                                 |
|------------------|---------------------------------------------|
| `\\`             | Backslash                                   |
| `\'`             | Single quote                                |
| `\"`             | Double quote                                |
| `\n`             | New line (line break)                      |
| `\r`             | Carriage return                             |
| `\t`             | Tab                                         |
| `\b`             | Backspace                                   |
| `\f`             | Form feed                                   |

---

## String Immutability in Java

In Java, `String` objects are **immutable**. Once a string is created, its value cannot be changed. Any operation that appears to modify a string will actually create a new string object.

### Why Strings Are Immutable:
1. **Thread Safety**: Immutable objects are safe to use in multi-threaded environments.
2. **Security**: Prevents accidental modification or tampering.
3. **Performance**: Enables caching and reuse of string objects.

### Example:
```java
String str = "Hello";
String modifiedStr = str.concat(", World!");

// Original string remains unchanged
System.out.println("Original: " + str);        // Output: Hello
System.out.println("Modified: " + modifiedStr); // Output: Hello, World!
