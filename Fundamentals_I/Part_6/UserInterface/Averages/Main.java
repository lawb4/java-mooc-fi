package Fundamentals_I.Part_6.UserInterface.Averages;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*GradeRegister register = new GradeRegister();
        register.addGradeBasedOnPoints(93);
        register.addGradeBasedOnPoints(91);
        register.addGradeBasedOnPoints(92);
        register.addGradeBasedOnPoints(88);

        System.out.println(register.averageOfGrades());

        System.out.println();

        GradeRegister register1 = new GradeRegister();
        register1.addGradeBasedOnPoints(93);
        register1.addGradeBasedOnPoints(91);
        register1.addGradeBasedOnPoints(92);

        System.out.println(register1.averageOfPoints());*/

        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();

        UserInterface ui = new UserInterface(register, scanner);
        ui.start();
    }
}
