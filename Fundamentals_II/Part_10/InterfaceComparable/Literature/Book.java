package Fundamentals_II.Part_10.InterfaceComparable.Literature;

public class Book {

    private String title;
    private int age;

    public Book(String title, int age) {
        this.title = title;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return getTitle() + " (recommended for " + getAge() + " years-olds or older)";
    }
}
