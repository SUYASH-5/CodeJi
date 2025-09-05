# CodeJi IDE

**CodeJi** is a lightweight, custom programming language IDE inspired by Bhailang. It comes with a GUI built using JavaFX and a parser/interpreter implemented with ANTLR. The IDE allows you to write, run, and debug CodeJi programs with syntax highlighting, variable tracking, and more.

---

## Features

- Code editor with **syntax highlighting** using RichTextFX.
- **Run/Reset/Clear** buttons for easy code execution.
- **Variable viewer** to track CodeJi variables in real-time.
- **Load/Save** `.cji` files.
- Light and Dark **themes**.
- Built on **JavaFX**, **ANTLR**, and **Java 21**.

---

## Requirements

- **Java 21** or higher
- **JavaFX SDK** (binaries included in `lib/`)
- **ANTLR 4.13.2** (for parser/lexer generation)
- **Maven/Gradle** (optional, for dependency management)

---

## Usage

- Write your CodeJi programs in the editor.
- Click **Run** to execute code and see output in the console.
- Use **Clear** to clear output, **Reset** to reset variables.
- Switch between **Light/Dark themes** using the dropdown.
- Save and load `.cji` files using the **Save/Load** buttons.


---

## Images/Screenshots
Here are some screenshots of the CodeJi IDE in action:

### Light Theme
<img width="1102" height="682" alt="Screenshot 2025-05-23 062626" src="https://github.com/user-attachments/assets/9c56bf48-83c2-4750-bb42-0ec67c9ad5fc" />
<img width="1096" height="685" alt="Screenshot 2025-05-23 062741" src="https://github.com/user-attachments/assets/128fb1fc-587d-4357-a27c-a9a2e4bf26ca" />
<img width="1105" height="691" alt="Screenshot 2025-05-23 062508" src="https://github.com/user-attachments/assets/79951324-b3c8-4414-8f73-83244619f876" />

-----

### Dark Theme
<img width="1096" height="685" alt="Screenshot 2025-05-23 063004" src="https://github.com/user-attachments/assets/fb30d81c-7bb5-428f-9989-462af29d2cea" />


---

## Syntax to code

<img width="423" height="657" alt="image" src="https://github.com/user-attachments/assets/36d9602d-fb23-4756-b839-b70c625fd0ad" />


---

## Setup & Run

1. **Clone the repository**

```bash
git clone https://github.com/SUYASH-5/CodeJi.git
cd CodeJi
```

2. **Compile the code**
- The repository already includes compiled `.class` files in the `src/` folder.
If the `.class` files are missing, compile using:

```bash
javac -cp "lib/*" src/*.java generated/*.java
```

3. **Run the IDE**

```bash
java --module-path "./lib" --add-modules javafx.controls,javafx.fxml,javafx.graphics,javafx.base --add-opens javafx.graphics/com.sun.javafx.tk.quantum=ALL-UNNAMED -cp ".;lib/*;resources" src.CodejiGUI
```



# Key changes:

- Clarified that **.class files are already included**.  
- Added instruction **only compile if missing**.  
- Updated the run command to use `src` classpath since your `.class` files are in `src/`.  

---

