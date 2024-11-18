# Arrays in Java

## Key Points
Arrays are:
- **Indexed**: starting from 0.
- **Homegenous**: all elements are of the same type.
- **Fixed size*: set at creation and can't be modified.
---

## Declaration and Initialization
### Declaration
```java
int[] numbers; // Preferred style
int numbers[]; // Alternative but less common
```

### Initialization
#### 1. With `new`:
```java
int[] numbers = new int[5]; // Creates an array of size 5 with default values (0 for int)
// assing values later
numbers[0] = 1;
numbers[1] = 2;
numbers[2] = 3;

// or
int[] numbers = new int[] {1, 2, 3};  // Explicit array creation
```

#### 2. Without `new`:
The array is initialized directly with the values, so the size is determined by the number of values you provide.
```java
int[] numbers = {10, 20, 30, 40}; // Size is inferred (4 in this case)
```

---

## Recap of `java.util.Arrays` Methods

The `java.util.Arrays` class provides many useful static methods for working with arrays, such as sorting, searching, filling, and comparing arrays.

| **Method**                     | **Description**                                                         | **Example**                                                   |
|---------------------------------|-------------------------------------------------------------------------|---------------------------------------------------------------|
| **`Arrays.sort()`**             | Sorts the elements of the array in ascending order.                     | `Arrays.sort(numbers);`                                        |
| **`Arrays.copyOf()`**           | Copies the array, optionally resizing it to a new length.                | `int[] copy = Arrays.copyOf(numbers, numbers.length);`         |
| **`Arrays.copyOfRange()`**      | Copies a specified range from an array to a new array.                   | `int[] part = Arrays.copyOfRange(numbers, 2, 5);`             |
| **`Arrays.fill()`**             | Fills the array with a specific value.                                  | `Arrays.fill(numbers, 5);`                                     |
| **`Arrays.equals()`**           | Compares two arrays for equality (element-wise).                         | `bool b = Arrays.equals(arr1, arr2);`                                   |
| **`Arrays.binarySearch()`**     | Searches for a value in a sorted array using binary search.              | `int index = Arrays.binarySearch(numbers, 5);`                 |
| **`Arrays.toString()`**         | Converts the array to a string representation.                           | `String result = Arrays.toString(numbers);`                    |
| **`Arrays.asList()`**           | Converts an array to a `List` (useful for working with collections).    | `List<Integer> list = Arrays.asList(numbers);`                  |
| **`Arrays.hashCode()`**         | Returns a hash code based on the contents of the array.                  | `int hash = Arrays.hashCode(numbers);`                          |
| **`Arrays.parallelSort()`**     | Sorts the array using parallel sorting for better performance on large arrays. | `Arrays.parallelSort(numbers);`                              |
