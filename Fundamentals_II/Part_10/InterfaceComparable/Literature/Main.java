package Fundamentals_II.Part_10.InterfaceComparable.Literature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = sc.nextLine();

            if (name.equals("")) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            String input = sc.nextLine();

            if (input.equals("")) {
                break;
            }
            int age = Integer.valueOf(input);

            books.add(new Book(name, age));

            System.out.println();
        }

        System.out.println("\n" + books.size() + " book(s) in total." + "\n");
        System.out.println("Books:");

        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getTitle);

        //Collections.sort(books, comparator);
        books.sort(comparator);

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
