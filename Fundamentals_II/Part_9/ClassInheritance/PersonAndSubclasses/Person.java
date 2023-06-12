package Fundamentals_II.Part_9.ClassInheritance.PersonAndSubclasses;

public class Person {

    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString(){
        return this.name + "\n" + "  " + this.address;
    }
}
