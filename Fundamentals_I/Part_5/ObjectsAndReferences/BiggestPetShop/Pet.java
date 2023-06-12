package Fundamentals_I.Part_5.ObjectsAndReferences.BiggestPetShop;

public class Pet {
    private String name;
    private String breed;

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
}
