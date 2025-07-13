# Library Management System 2.O


This Java console application lets you manage a small library collection: add books, display the catalogue, borrow/return titles, search, and delete entries.

<img width="395" height="205" alt="Library_01 png" src="https://github.com/user-attachments/assets/43f5cabd-9f9a-49dd-99f2-7cc332767f60"/>

## Project: "Library Management System (Console Edition)"
This will be a Library Management System (LMS) where users can:
- Add new books.
- View a list of books.
- Search for books by title or author.
- Borrow books.
- Return books.
- Remove books.

<br/>

## Features:
- *Add Book*: Users can add a new book with details like title, author, ISBN, genre, and availability.
- *Display Books*: Display all the books with their details.
- *Search Books*: Search by title or author.
- *Borrow Books*: Mark a book as borrowed.
- *Return Books*: Mark a book as returned.
- *Delete Book*: Delete a book from the system.
- *Command-line interface (CLI)*: Interact with the system via console commands.
- Clear, table‑like catalogue display with availability status.
- Real‑time count of total and available books.

<br/>

## Quick Start
1. Compile:
```bash
javac Main.java
```
2. Run:
```bash
java Main
```

<br/>

## Project Structure
- ```Book.java```: Book data model (ID, Title, Author, Status)
- ```Library.java```: Core library operations(add, display, borrow, return, delete)
- ```Main.java```: Program entry point

<br/>

## Usage Guide
1. Launch the program: ```java Main```
2. Follow the on - screen menu:<br/>
<img width="233" height="191" alt="Library_05 png" src="https://github.com/user-attachments/assets/f5c96d84-64f7-497c-94fd-ed179de90df3" /><br/>
3. Enter the choice number and supply any requested details (book ID, title, etc.)
4. Exit the application from the menu when done.

<br/>

## Output
<img width="1663" height="903" alt="Library_02 png" src="https://github.com/user-attachments/assets/5b66bd1f-bed7-4b11-9f5d-3313b8116ab0" /><br/>
<img width="1091" height="894" alt="Library_03 png" src="https://github.com/user-attachments/assets/e9e000e1-835d-409c-a887-51be3864d1fd" /><br/>
<img width="1147" height="583" alt="Library_04 png" src="https://github.com/user-attachments/assets/9d3f0b76-b53b-4189-be9f-906bae3169ad" /><br/>

## Notes & Limitations
- Data resides only in memory; it resets every time the program stops.
- Input validation is minimal; invalid data may cause errors.

<br/>

## License
This project is released under the MIT License - see the [LICENSE](LICENSE) file for details.
