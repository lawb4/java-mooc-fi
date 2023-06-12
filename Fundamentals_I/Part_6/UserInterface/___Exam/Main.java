package Fundamentals_I.Part_6.UserInterface.___Exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*GradeRegister register = new GradeRegister();
        register.addGradeBasedOnPoints(51);
        register.addGradeBasedOnPoints(50);
        register.addGradeBasedOnPoints(49);

        System.out.println("Number of students with " +
        "grade 0 (should be 1): " + register.numberOfGrades(0));

        System.out.println("Number of students with " +
        "grade 0 (should be 2): " + register.numberOfGrades(1));*/

        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();

        UserInterface userInterface = new UserInterface(register, scanner);
        userInterface.start();

    }
}
