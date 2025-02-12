# Null Layout in Swing

The null layout also called **absolute positionning**, used to disable the layout manager in a swing container and specify the position and size manually using:
```java
setBounds(x, y, width, height);
```

---

## Key Characteristics

- **No Automatic Resizing:** Components do not adjust when when window is resized.
- **Overlapping:** Since positionning is manual, components can overlap if placed incorrectly.
- **Not cross-platform friendly:** Component sizes can vary on different OS and screen resolutions.
