# FlowLayout in Swing

## Overview
`FlowLayout` arranges components in a row, wrapping them to the next line if needed. Each component is given its **preferred size**.  

By default, it:  
- Aligns components **centered**.
- Places them in **left-to-right order**.
- Wraps components to the next row **if there isn’t enough space**.

---

## Common Methods

| Method | Description |
|--------|------------|
| `setLayout(new FlowLayout(int align, int hgap, int vgap))` | Defines **alignment**, horizontal gap, and vertical gap. |
| `setPreferredSize(new Dimension(width, height))` | Suggests a preferred size for a component. |
| `setBackground(Color color)` | Sets the background color of the panel. |

---

### Key Notes

#### `frame.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));`

- `FlowLayout.CENTER` **centers** components (default).  
- `0` sets **no horizontal spacing** between components.  
- `10` sets **10px vertical spacing** between rows.  

#### `panel.setLayout(new FlowLayout());`

- `JPanel` **already defaults** to `FlowLayout`, but explicitly setting it makes it clear.  

#### Why add buttons to `panel` instead of `frame`?

- `JPanel` acts as a **container**, allowing more flexible layout adjustments.  
- If added directly to `frame`, buttons would be affected by `frame`'s layout, not `panel`'s.  

#### `panel.setPreferredSize(new Dimension(100, 250));`

- Ensures the panel has a **fixed width (100px)** and a **height of 250px**.  
- Since `FlowLayout` respects preferred sizes, buttons arrange neatly inside.  
