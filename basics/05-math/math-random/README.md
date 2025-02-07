# Math Random Method  

`Math.random()` function returns a random number between `0.0` (inclusive) and `1.0` (exclusive).  
Meaning the interval is: **[0.0, 1.0)**  

### More Control  
For more control over the range:  
- For a range from `0` to `n`: multiply by `(n+1)` because the upper bound of the interval is not included, and return it as an `int` or just round it.  
- For a **custom range `[min, max]`**, use:  
```java
int randomNum = (int) (Math.random() * (max - min + 1)) + min;
```
This ensures the random number stays within `[min, max]` **inclusively**.  
