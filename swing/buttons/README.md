# Swing JButton Example

A **JButton** is a GUI component in **Swing** used to trigger an action when clicked. It can display text, an icon, or both.

---

## Key JButton Methods

| Method | Description |
|--------|------------|
| `setText(String text)` | Sets the button's label text. |
| `setIcon(ImageIcon icon)` | Adds an image to the button. |
| `setBounds(int x, int y, int width, int height)` | Manually sets the button's position and size. |
| `setFocusable(boolean focusable)` | Disables the focus border if set to `false`. |
| `setForeground(Color color)` | Sets the text color. |
| `setBackground(Color color)` | Sets the button’s background color. |
| `setBorder(Border border)` | Customizes the button’s border. |
| `setEnabled(boolean enabled)` | Enables or disables the button. |
| `addActionListener(ActionListener l)` | Adds an event listener to handle clicks. |

---

### Key Notes

#### **Why `this.setLayout(null);`?**

- By default, Swing uses a **layout manager** to arrange components automatically.  
- Setting `null` removes the default layout, allowing **absolute positioning** using `setBounds()`.  

#### **Why `button.setFocusable(false);`?**

- This prevents the **dotted border** when the button is clicked, making it look cleaner.

#### **Why `label.setVisible(false);` initially?**

- The label (showing `pixel_cat.png`) **starts hidden** and appears **only after clicking the button**.

#### **Why `addActionListener(this);`?**

- `this` refers to the **current class**, which implements `ActionListener`.  
- This allows the `actionPerformed` method to handle button clicks.
