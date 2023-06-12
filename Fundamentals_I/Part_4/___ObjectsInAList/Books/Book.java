package Fundamentals_I.Part_4.___ObjectsInAList.Books;

public class Book {
    private String title;
    private String pages;
    private String year;

    public Book(String title, String pages, String year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public String getPages() {
        return this.pages;
    }

    public String getYear() {
        return this.year;
    }

    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
}
