package Fundamentals_I.Part_7.Algorithms.Searching;

public class Book {

    private int id;
    private String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "(id: " + id + "; name: " + name + ")";
    }
}
