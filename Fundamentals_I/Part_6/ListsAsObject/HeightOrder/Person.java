package Fundamentals_I.Part_6.ListsAsObject.HeightOrder;

import java.util.Objects;

public class Person {

    private String name;
    private int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.height + " cm)";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        final Person other = (Person) obj;

        return this.height != other.height &&
                Objects.equals(this.name, other.name);
    }
}
