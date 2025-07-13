import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getId() == book.getId()) {
                System.out.println("Book with this ID already exists!");
                return;
            }
        }
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.printf("%-5s %-20s %-20s %-15s%n", "ID", "Title", "Author", "Status");
        System.out.println("---------------------------------------------------------------");

        for (Book b : books) {
            System.out.printf("%-5d %-20s %-20s %-15s%n",
                    b.getId(), b.getTitle(), b.getAuthor(), b.isAvailable() ? "Available" : "Not Available");
        }

        long availableCount = books.stream().filter(Book::isAvailable).count();
        System.out.println("\nTotal Books: " + books.size() + ", Available: " + availableCount);
    }

    public void borrowBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                if (b.isAvailable()) {
                    b.borrowBook();
                    System.out.println("Book borrowed successfully.");
                } else {
                    System.out.println("Book is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                if (!b.isAvailable()) {
                    b.returnBook();
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Book is already available.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void deleteBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                books.remove(b);
                System.out.println("Book deleted successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void searchBook(String keyword) {
        boolean found = false;
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                    b.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                if (!found) {
                    System.out.printf("%-5s %-20s %-20s %-15s%n", "ID", "Title", "Author", "Status");
                    System.out.println("---------------------------------------------------------------");
                    found = true;
                }
                System.out.printf("%-5d %-20s %-20s %-15s%n",
                        b.getId(), b.getTitle(), b.getAuthor(), b.isAvailable() ? "Available" : "Not Available");
            }
        }
        if (!found) {
            System.out.println("No books matched your search.");
        }
    }
}
