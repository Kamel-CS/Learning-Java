# Labels in Swing

A JLabel object can display either text, an image, or both.

---

## Common `JLabel` Methods

| Method | Description |
| --- | --- |
| `JLabel()` | Creates a label with no text. |
| `JLabel(String text)` | Creates a label with the specified text. |
| `JLabel(String text, int horizontalAlignment)` | Creates a label with the specified text and horizontal alignment. |
| `setText(String text)` | Sets the text of the label. |
| `setIcon(Icon icon)` | Sets the icon of the label. |
| `getText()` | Returns the text of the label. |
| `setFont(Font font)` | Sets the font of the label. |
| `getFont()` | Returns the font of the label. |
| `setForeground(Color color)` | Sets the foreground color of the label. |
| `getForeground()` | Returns the foreground color of the label. |
| `setBackground(Color color)` | Sets the background color of the label. |
| `setOpaque(boolean isOpaque)` | Sets the opacity of the label. Set `true` to see the background color. |
| `getBackground()` | Returns the background color of the label. |
| `setHorizontalAlignment(int alignment)` | Sets the horizontal alignment of the label. |
| `getHorizontalAlignment()` | Returns the horizontal alignment of the label. |
| `setVerticalAlignment(int alignment)` | Sets the vertical alignment of the label. |
| `getVerticalAlignment()` | Returns the vertical alignment of the label. |
| `setIconTextGap(int iconTextGap)` | Sets the gap between the icon and the text. |
| `getIconTextGap()` | Returns the gap between the icon and the text. |
| `setBorder(Border border)` | Sets the border of the label. |
| `getBorder()` | Returns the border of the label. |


- **`int alignment`** can be one of the following:
  - `SwingConstants.LEFT`
  - `SwingConstants.CENTER`
  - `SwingConstants.RIGHT`
    
Or to be accessed using:
  - `JLabel.LEFT` 
  - `JLabel.CENTER` 
  - `JLabel.RIGHT`
