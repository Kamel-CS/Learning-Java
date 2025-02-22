# Java Swing OptionPane

`JOptionPane` makes it easy to pop up a standard dialog box that prompts users for a value or informs them of something.

---

## Common Methods

### 1. `showMessageDialog`
Displays a simple message dialog with a title, message, and optional icon.

- **Syntax:**
```java
JOptionPane.showMessageDialog(Component parentComponent, Object message, String title, int messageType);
```

- **Parameters:**
  - **`parentComponent`**: The parent component of the dialog (use `null` for centered display).
  - **`message`**: The message to display (e.g., "Some Useless Info").
  - **`title`**: The title of the dialog (e.g., "title").
  - **`messageType`**: The type of message (e.g., `JOptionPane.PLAIN_MESSAGE`, `JOptionPane.INFORMATION_MESSAGE`).


### 2. `showConfirmDialog`
Displays a dialog with yes/no/cancel options and returns the user's choice as an integer.

- **Syntax:**
```java
int response = JOptionPane.showConfirmDialog(Component parentComponent, Object message, String title, int optionType);
```

- **Parameters:**
  - **`parentComponent`**: The parent component of the dialog (use `null` for centered display).
  - **`message`**: The message to display (e.g., "Bro, do you even code?").
  - **`title`**: The title of the dialog (e.g., "title").
  - **`optionType`**: The type of options (e.g., `JOptionPane.YES_NO_CANCEL_OPTION`).

- **Return Values:**
  - `0` for **Yes**
  - `1` for **No**
  - `2` for **Cancel**
  - `-1` if the dialog is closed without selecting an option.


### 3. `showInputDialog`
Displays a dialog that prompts the user to enter text or select a value.

- **Syntax:**
```java
String input = JOptionPane.showInputDialog(Component parentComponent, Object message);
```

- **Parameters:**
  - **`parentComponent`**: The parent component of the dialog (use `null` for centered display).
  - **`message`**: The message to display (e.g., "What is your name?").

- **Return Value:**
  - The user's input as a `String`.


### 4. `showOptionDialog`
Displays a highly customizable dialog with custom buttons, icons, and options.

- **Syntax:**
```java
int response = JOptionPane.showOptionDialog(Component parentComponent, Object message, String title, int optionType, int messageType, Icon icon, Object[] options, Object initialValue);
```

- **Parameters:**
  - **`parentComponent`**: The parent component of the dialog (use `null` for centered display).
  - **`message`**: The message to display (e.g., "You are awesome!").
  - **`title`**: The title of the dialog (e.g., "title").
  - **`optionType`**: The type of options (e.g., `JOptionPane.YES_NO_CANCEL_OPTION`).
  - **`messageType`**: The type of message (e.g., `JOptionPane.INFORMATION_MESSAGE`).
  - **`icon`**: A custom icon to display (use `null` for the default icon).
  - **`options`**: An array of custom button labels (e.g., `{"No, you are awesome!", "Thanks Bro!", "BRUH"}`).
  - **`initialValue`**: The default selected option (e.g., `0` for the first option).

- **Return Value:**
  - The index of the selected option (e.g., `0` for the first button, `1` for the second, etc.).

---

## Key Notes
- **Customization:** `showOptionDialog` is the most flexible method, allowing you to define custom buttons, icons, and default selections.
- **Use Cases:** Ideal for creating dialogs with non-standard options or custom user interactions.
