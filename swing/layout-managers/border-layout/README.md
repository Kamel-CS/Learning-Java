# `BorderLayout` in Swing

A `BorderLayout` arranges components into five areas:
- `NORTH` – Expands **horizontally** at the top.
- `SOUTH` – Expands **horizontally** at the bottom.
- `WEST` – Expands **vertically** on the left.
- `EAST` – Expands **vertically** on the right.
- `CENTER` – Expands **proportionally** to fill the remaining space.

This is **the default layout for `JFrame`**, meaning you don't need to set it explicitly.

---

## Common Methods

| Method | Description |
|--------|------------|
| `setLayout(new BorderLayout(int hgap, int vgap))` | Defines the layout with optional **horizontal** and **vertical** gaps. |
| `setPreferredSize(new Dimension(width, height))` | Suggests a size for a component (but may be overridden by the layout). |
| `setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)` | Closes the program when the window is closed. |

---

### Key Notes

#### `frame.setLayout(new BorderLayout(10, 10));`

- While `JFrame` **defaults** to `BorderLayout`, you **explicitly set margins** of `10px` between components.

#### `setPreferredSize(new Dimension(100, 100));`

- This suggests **a preferred size**, but since `BorderLayout` controls how components resize, the actual sizes may vary.

#### Why does `CENTER` expand?

- `BorderLayout` **stretches** the `CENTER` component to fill all available space **after** placing the other regions.

#### `panel5` and `BorderLayout`

- By default, `JPanel` uses **FlowLayout** (aligning elements in a row).
- You **change** `panel5` to `BorderLayout` so you can arrange its **sub-panels** in `NORTH, SOUTH, WEST, EAST, CENTER`.
