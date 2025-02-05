# Hash Maps in Java

A HashMap is a part of the Java Collections Framework and implements the Map interface.
It stores data in key-value pairs, where each key is unique. HashMaps provide fast lookups, insertions, and deletions.

---

## Key Notes

- **No Duplicate Keys:** Every key is unique.
- **`null`:** Can have one `null` key and multiple `null` values.
- **Unordered**.
- **Fast `get` and `put` operations:** O(1) time complexity

---

## Key Methods

| **Operation**            | **Method**                          | **Worst-Case Time Complexity** |
|--------------------------|-------------------------------------|--------------------------------|
| **Add/Update**           | `put(K key, V value)`              | O(n)                           |
| **Retrieve**             | `get(Object key)`                  | O(n)                           |
| **Remove**               | `remove(Object key)`               | O(n)                           |
| **Check for Key**        | `containsKey(Object key)`          | O(n)                           |
| **Check for Value**      | `containsValue(Object value)`      | O(n)                           |
| **Iterate**              | `keySet()`, `values()`, `entrySet()` | O(n)                         |
| **Size**                 | `size()`                           | O(1)                           |
| **Clear**                | `clear()`                          | O(n)                           |
