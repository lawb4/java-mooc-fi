package Fundamentals_I.Part_5.ObjectsAndReferences.HealthStation;

public class HealthStation {
    private int weighingsCount;

    public int weigh(Person person) {
        weighingsCount++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return weighingsCount;
    }
}
