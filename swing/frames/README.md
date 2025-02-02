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
| `pack()` | Sizes the frame to fit its components |

- `setDefaultCloseOperation(int operation)`:
  - `HIDE_ON_CLOSE`. Default
  - `EXIT_ON_CLOSE`.
  - `DO_NOTHING_ON_CLOSE`.

- `setIconImage()`:
Must create an `ImageIcon` first:
```java
import javax.swing.ImageIcon;

ImageIcon myImageIcon = new ImageIcon("Path/to/my/image");
frame.setIconImage(myImageIcon.getImage())  // it takes Image not ImageIcon
```
---

## Next Step

- Explore Using **Composition** over **Inheritance**.
