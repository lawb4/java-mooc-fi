package Fundamentals_I.Part_4.___ObjectsInAList.Books;

import java.util.ArrayList;
import java.util.Scanner;

/*
Write a program that first reads book information from the user.
The details to be asked for each book include the title, the number of pages and the publication year.
Entering an empty string as the name of the book ends the reading process.

After this the user is asked for what is to be printed. If the user inputs "everything",
all the details are printed: the book titles, the numbers of pages and the publication years.
However, if the user enters the string "name", only the book titles are printed.

It is probably worthwhile to implement a class called Book to represent a book.
There are two points in total available for this exercise.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = sc.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            String pages = sc.nextLine();
            System.out.print("Publication year: ");
            String year = sc.nextLine();

            bookList.add(new Book(title, pages, year));
        }
        System.out.println();

        System.out.print("What information to be printed? ");
        String info = sc.nextLine();

        for (Book book : bookList) {
            if (info.equals("everything")) {
                System.out.println(book);
            } else if (info.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}
