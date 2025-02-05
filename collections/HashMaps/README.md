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

## Methods Used

### 1. **Adding Elements**
- **`put(K key, V value)`**: Adds a key-value pair to the `HashMap`. If the key already exists, the value is updated.

### 2. **Retrieving Elements**
- **`get(Object key)`**: Returns the value associated with the specified key, or `null` if the key is not found.
- **`getOrDefault(Object key, V defaultValue)`**: Returns the value for the specified key, or a default value if the key is not found.

### 3. **Removing Elements**
- **`remove(Object key)`**: Removes the key-value pair for the specified key.
- **`remove(Object key, Object value)`**: Removes the key-value pair only if the key is mapped to the specified value.

### 4. **Checking for Keys and Values**
- **`containsKey(Object key)`**: Returns `true` if the `HashMap` contains the specified key.
- **`containsValue(Object value)`**: Returns `true` if the `HashMap` contains the specified value.

### 5. **Iterating Over the HashMap**
- **`keySet()`**: Returns a set of all keys in the `HashMap`.
- **`values()`**: Returns a collection of all values in the `HashMap`.
- **`entrySet()`**: Returns a set of all key-value pairs in the `HashMap`.

### 6. **Other Useful Methods**
- **`size()`**: Returns the number of key-value pairs in the `HashMap`.
- **`isEmpty()`**: Returns `true` if the `HashMap` is empty.
- **`clear()`**: Removes all key-value pairs from the `HashMap`.
