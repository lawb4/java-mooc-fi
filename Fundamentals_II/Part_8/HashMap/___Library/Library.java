package Fundamentals_II.Part_8.HashMap.___Library;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private HashMap<String, Book> directory;

    public Library() {
        this.directory = new HashMap<>();
    }

    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }

    public void addBook(Book book) {
        String name = sanitizedString(book.getName());

        if (directory.containsKey(name)) {
            System.out.println("Book is already in the library!");
        } else {
            directory.put(name, book);
        }
    }

    public Book getBook(String bookTitle) {
        bookTitle = sanitizedString(bookTitle);
        return directory.get(bookTitle);
    }

    public void removeBook(String bookTitle) {
        bookTitle = sanitizedString(bookTitle);

        if (directory.containsKey(bookTitle)) {
            directory.remove(bookTitle);
        } else {
            System.out.println("Book was not found, cannot be removed!");
        }
    }

    public ArrayList<Book> getBookByPart(String titlePart) {
        titlePart = sanitizedString(titlePart);

        ArrayList<Book> books = new ArrayList<>();

        for (String bookTitle : directory.keySet()) {
            if (bookTitle.contains(titlePart)) {
                books.add(directory.get(bookTitle));
            }
        }

        return books;
    }
}
