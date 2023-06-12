package Fundamentals_I.Part_6.ListsAsObject.HeightOrder;

import java.util.ArrayList;

public class Room {

    private ArrayList<Person> room;

    public Room() {
        this.room = new ArrayList<>();
    }

    public void add(Person person) {
        this.room.add(person);
    }

    public boolean isEmpty() {
        return this.room.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.room;
    }

    public Person shortest() {
        if (room.isEmpty()) {
            return null;
        }

        Person shortestIf = room.get(0);
        for (Person person : room) {
            if (shortestIf.getHeight() > person.getHeight()) {
                shortestIf = person;
            }
        }
        return shortestIf;
    }

    public Person take() {
        Person shortestPerson = this.shortest();

        this.room.remove(shortestPerson);
        return shortestPerson;
    }
}