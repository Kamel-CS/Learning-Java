# Layer Pane in Java

`JLayeredPane` is a Swing container that provides a third dimension for positioning components: depth, also known as Z order.
When adding a component to a layered pane, you specify its depth as an integer. The higher the number, closer the component is to the "top" position within the container.

---

## Common Layers

| Layer Name      | Depth Value | 
|-----------------|-------------|
| `DEFAULT_LAYER` | 0           |
| `PALETTE_LAYER` | 100         |
| `MODAL_LAYER`   | 200         |
| `POPUP_LAYER`   | 300         |
| `DRAG_LAYER`    | 400         |

---

## Key Notes
- **Z-Order:** Components in higher layers (e.g., `DRAG_LAYER`) appear on top of components in lower layers (e.g., `DEFAULT_LAYER`).
- **Overlap:** Components in the same layer are stacked in the order they are added.
- **Use Cases:** `JLayeredPane` is ideal for creating UIs with overlapping components, such as pop-ups, tooltips, or drag-and-drop interfaces.
