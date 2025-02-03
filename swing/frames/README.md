# Frames in Swing

## What is `JFrame`?

`JFrame` is a top-level container in Java Swing used to create windows. It provides a framework for building GUI applications, including support for adding components like buttons, labels, and panels.

---

## Using Inheritance

One way to create a `JFrame` is to extend the class and override its methods. This allows you to customize the window's behavior and appearance.
This is useful for creating reusable components or adding custom functionality to the frame.

---

## Common `JFrame` Methods

| Method | Description |
| --- | --- |
| `JFrame()` | Creates a new frame with an empty title |
| `JFrame(String title)` | Creates a new frame with the specified title |
| `setTitle(String title)` | Sets the title of the frame |
| `setSize(int width, int height)` | Sets the size of the frame |
| `setDefaultCloseOperation(int operation)` | Sets the default close operation for the frame |
| `setVisible(boolean visible)` | Sets the visibility of the frame |
| `setLocation(int x, int y)` | Sets the location of the frame (x,y coordinates)|
| `setLocationRelativeTo(Component c)` | Sets the location of the frame relative to the specified component, or `null` to center it |
| `setResizable(boolean resizable)` | Sets whether the frame is resizable |
| `setBackground(Color color)` | Sets the background color of the frame |
| `setIconImage(Image image)` | Sets the icon image for the frame |
| `add(Component comp)` | Adds a component to the frame |
| `remove(Component comp)` | Removes a component from the frame |
| `getContentPane()` | Returns the content pane of the frame |
|`getImage()`| Returns Image from the `ImageIcon` |
| `pack()` | Sizes the frame to fit its components |

---

### Key Notes

#### Default Close Operations

  - `HIDE_ON_CLOSE`. Default
  - `EXIT_ON_CLOSE`.
  - `DO_NOTHING_ON_CLOSE`.

#### Set an Image Icon

The `setIconImage(Image image)` expects an `Image` object, not an `ImageIcon`.
  - Create an `ImageIcon` and then extract the `Image` from it.

Compact Verstion of the code:
```java
this.setIconImage(new ImageIcon("./github_logo.png").getImage());
```
This is useful to avoid potential issues.

#### Using `getContentPane()`

JFrame consists of multiple layers. UI components like buttons and panels are added to the content pane, not the frame itself.

  - `frame.getContentPane().setBackground(...)` ensures the background color applies correctly.

---

## Next Step

- Explore Using **Composition** over **Inheritance**.
