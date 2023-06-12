package Fundamentals_II.Part_9.ObjectPolymorphism.Animals;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat(){
        System.out.println(this.name + " eats");
    }

    public void sleep(){
        System.out.println(this.name + " sleeps");
    }
}
