package Fundamentals_I.Part_6.UserInterface.Averages;

import java.util.Scanner;

public class UserInterface {

    private GradeRegister register;
    private Scanner sc;

    public UserInterface(GradeRegister register, Scanner sc) {
        this.register = register;
        this.sc = sc;
    }

    public void start() {
        readPoints();
        System.out.println();
        printGradeDistribution();
    }

    public void readPoints() {
        while (true) {
            System.out.print("Points: ");
            String input = sc.nextLine();

            if (input.equals("")) {
                break;
            }

            int points = Integer.valueOf(input);

            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }

            this.register.addGradeBasedOnPoints(points);
        }
    }

    public void printGradeDistribution() {
        for (int grade = 5; grade >= 0; grade--) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println();
        }
        //System.out.println();
        System.out.println("The average of points " + register.averageOfPoints());
        System.out.println("The average of grades " + register.averageOfGrades());
    }

    public static void printStars(int stars) {
        for (; stars > 0; stars--) {
            System.out.print("*");
        }
    }
}
