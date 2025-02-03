# Panels in Swing

A `JPanel` is a container used to group and organize other components within a GUI.

---

### Key Notes

#### Layout Manager
- By default, `JPanel` uses a **FlowLayout** manager, but it can be overridden.  
  - In the provided example, **no layout manager** is used (`setLayout(null)`), meaning absolute positioning is applied with `setBounds()`.
  
#### Bounds and Absolute Positioning
- The `setBounds(x, y, width, height)` method defines the **position and size** of components manually.
- **No layout manager**: Be cautious with absolute positioning as it can break layout consistency when resizing windows.

#### Adding Components
- Components (like `JLabel`) can be added to panels, which can then be added to the frame.
- Using `JPanel` as containers makes it easier to manage components and handle complex GUI structures.
