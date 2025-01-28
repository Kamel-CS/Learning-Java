# `ArrayList` in Java

An `ArrayList` is a resizable array implementation of the **List interface**. It is one of the most commonly used collections in Java because it provides dynamic arrays that can grow or shrink in size as needed.

---

## Key Features of ArrayList:

- Dynamic sizing: Unlike arrays, ArrayList can grow or shrink automatically.
- Allows null values: Can store `null`.
- Index-based access: Elements are accessed by their index.

---

## Key Methods of ArrayList:

| **Operation**            | **Method**                          | **Time Complexity**      |
|----------------------|----------------------------------|--------------------------|
| **Append**           | `add(E element)`                   | O(1) (amortized)         |
| **Add at index**         | `add(int index, E element)`        | O(n)                     |
| **Remove by index**      | `remove(int index)`                | O(n)                     |
| **Remove by object**     | `remove(Object o)`                 | O(n)                     |
| **Get by index**         | `get(int index)`                   | O(1)                     |
| **Set by index**         | `set(int index, E element)`        | O(1)                     |
| **Check size**           | `.size()`                           | O(1)                     |
| **Check emptiness**      | `.isEmpty()`                        | O(1)                     |
| **Check containment**    | `.contains(Object o)`               | O(n)                     |
| **Find index of element**| `indexOf(Object o)`                | O(n)                     |
| **Index of last occurrence**| `.lastIndexOf(Object o)`            | O(n)                     |
| **Clear list**           | `.clear()`                          | O(n)                     |
| **Convert to array**     | `.toArray()`                        | O(n)                     |
| **Sublist**              | `.subList(int fromIndex, int toIndex)` | O(1)                  |
