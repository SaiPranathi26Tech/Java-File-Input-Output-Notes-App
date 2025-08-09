# 📝 Java File I/O – Notes App 📁

## 📘 Overview
This project is a **console-based Notes Application** developed in Java.  
It allows users to **add and view personal notes**, storing them in a text file (`Notes.txt`) using **Java File I/O**.  

The program provides a simple **menu-driven interface** to manage notes, demonstrating the usage of:
- **FileWriter** and **BufferedReader** for file handling
- **Exception handling** (`try-catch`) for safe file operations
- **Scanner** for user input

This project is great for beginners to practice **Java File I/O**, loops, conditional statements, and exception handling.

---

## ✨ Features

### 🔹 Core Functionalities
- **Add Notes**: Accepts a note from the user and appends it to `Notes.txt`.
- **View Notes**: Displays all saved notes from the file, if available.
- **Persistent Storage**: Notes are stored in `Notes.txt` so they remain even after the program exits.

### 🛡️ Input Handling and Safety
- Checks if the file exists before reading notes.
- Handles **`FileNotFoundException`** and **`IOException`** gracefully.
- Prevents crashes by validating file operations inside `try-with-resources`.

---

## 🔁 Program Flow
The program runs in a continuous loop until the user chooses to exit.  

Menu:
1. **Add Note** – Takes user input and appends it to the file.  
2. **View Note** – Reads all stored notes and displays them.  
3. **Exit** – Ends the program.

The program uses:
- `addNotes(Scanner sc)` – for adding a note
- `viewNotes()` – for reading notes from the file

---

## 💻 Technologies Used

| Technology | Purpose |
|------------|---------|
| Java (JDK 17) | Programming language |
| VS Code | IDE used for development |
| Terminal / Console | Running and testing the program |
| java.io.* | File I/O operations |
| java.util.* | User input |

---

## 🎯 Learning Outcomes
By building this project, you will learn:
- How to **read and write** files in Java using **FileWriter** and **BufferedReader**.
- How to use **try-with-resources** for automatic resource management.
- How to implement **exception handling** for file operations.
- How to build a **menu-driven console application**.

---

## 👩‍💻 Author
**Thirakala Sai Pranathi**  
An aspiring software developer passionate about learning **Java**,  
building real-world applications, and exploring advanced programming concepts.

---

## 📝 License
This project is provided for educational purposes.  
You are free to use, modify, and enhance it for your own learning or academic work.

