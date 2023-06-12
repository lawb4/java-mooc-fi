package Fundamentals_I.Part_7.LargerProgrammingExercises.GradeStatistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeRegister points = new GradeRegister();

        UserInterface ui = new UserInterface(sc, points);
        ui.start();

        /*ArrayList<Integer> points = new ArrayList<>();

        int sum = 0;
        int sumPass = 0;
        int countPass = 0;
        double average = 0;
        double averagePass = 0;
        double passPercentage = 0;

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(sc.nextLine());

            if (input > 0 && input <= 100) {
                points.add(input);
                sum += input;
            }

            if (input >= 50 && input <= 100) {
                sumPass += input;
                countPass++;
            }

            if (input == -1) {
                average = (double) sum / points.size();
                System.out.println("Point average (all): " + average);

                averagePass = (double) sumPass / countPass;
                if (averagePass > 0) {
                    System.out.println("Point average (passing): " + averagePass);
                } else System.out.println("Point average (passing): -");

                passPercentage = (double) 100 * countPass / points.size();

                System.out.println("Pass percentage: " + passPercentage);
                break;
            }
        }*/
    }
}
