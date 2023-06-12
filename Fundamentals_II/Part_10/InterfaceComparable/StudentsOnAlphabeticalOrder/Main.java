package Fundamentals_II.Part_10.InterfaceComparable.StudentsOnAlphabeticalOrder;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("bcamo"));
        students.add(new Student("bamo1"));
        students.add(new Student("aamo1"));

        Collections.sort(students);
        students.stream()
                .forEach(h -> System.out.println(h));
    }
}
