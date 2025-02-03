# GridLayout in Swing

`GridLayout` arranges components in a **grid of rows and columns**, ensuring each cell has **equal size**.  

The constructor:  
```java
new GridLayout(int rows, int cols, int hgap, int vgap);
```
- `rows`: Number of rows in the grid.  
- `cols`: Number of columns in the grid.  
- `hgap`: Horizontal spacing between components.  
- `vgap`: Vertical spacing between components.  

---

## Key Notes

- The **entire container is divided into equal-sized cells** based on the specified rows and columns.  
- **All components are resized** to fit their cells, regardless of their original size.  
- **Spacing (`hgap`, `vgap`)** controls the space between grid cells, improving readability.  

---

### What Happens If the Number of Components Doesn't Match the Grid?
- If **fewer components** are added than required, the **remaining cells stay empty**.  
- If **more components** are added than the grid allows, the grid **expands dynamically** by increasing the number of rows.  
- If **rows or columns are set to `0`**, the layout adjusts automatically:
  - `new GridLayout(0, 3)` → Unlimited rows, **3 columns**.
  - `new GridLayout(3, 0)` → **3 rows**, unlimited columns.  
