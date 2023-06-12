package Fundamentals_I.Part_7.LargerProgrammingExercises.GradeStatistics;

import java.util.Scanner;

public class UserInterface {

    private Scanner sc;
    private GradeRegister register;

    public UserInterface(Scanner sc, GradeRegister grades) {
        this.sc = sc;
        this.register = grades;
    }

    public void start() {

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(sc.nextLine());

            this.register.addPoints(input);
            this.register.addGradesBasedOnPoints(input);

            if (input == -1) {
                printAverage();
                printAverageOfPassed();
                printPassPercentage();

                printGradeDistribution();

                break;
            }
        }
    }

    public void printAverage() {
        System.out.println("Point average (all): " + register.getAverage());
    }

    public void printAverageOfPassed() {
        if (register.getAverageOfPassed() > 0) {
            System.out.println("Point average (passing): " + register.getAverageOfPassed());
        } else System.out.println("Point average (passing): -");
    }

    public void printPassPercentage() {
        System.out.println("Pass percentage: " + register.getPassPercentage());
    }

    public void printGradeDistribution() {
        for (int grade = 5; grade >= 0; grade--) {
            int stars = register.numberOfGrades(grade); // if 5 is available, stars++
            System.out.print(grade + ": "); // 5:

            printStars(stars); // writes the *
            System.out.println();
        }
    }

    private void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
