package Fundamentals_II.Part_9.ClassInheritance.PersonAndSubclasses;

public class Student extends Person {
    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public int credits() {
        return this.credits;
    }

    public void study() {
        this.credits++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "  Study credits " + this.credits;
    }
}
