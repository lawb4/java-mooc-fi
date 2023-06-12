package Fundamentals_II.Part_10.OtherUsefulTechniques.EnumAndIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        this.employees.addAll(peopleToAdd);
        //peopleToAdd.stream().forEach(person -> Employees.this.add(person))
    }

    public void print() {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education){
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()){
            if (iterator.next().getEducation().equals(education)){
                iterator.remove();
            }
        }
    }
}
