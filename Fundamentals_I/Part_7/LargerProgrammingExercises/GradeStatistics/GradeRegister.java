package Fundamentals_I.Part_7.LargerProgrammingExercises.GradeStatistics;

import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> points;  // "register" for points
    private ArrayList<Integer> grades;  // "register" for grades based on points


    public GradeRegister() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addPoints(int input) {
        if (input >= 0 && input <= 100) {
            this.points.add(input);
        }
    }

    public void addGradesBasedOnPoints(int points) {
        if (points >= 0 && points <= 100) {
            this.grades.add(pointsToGrades(points));
        }
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : grades) {
            if (received == grade) {
                count++;
            }
        }
        return count;
    }

    public int getSum() {
        int sum = 0;
        for (Integer point : points) {
            sum += point;
        }
        return sum;
    }

    public int getSumOfPassed() {
        int sumOfPassed = 0;
        for (Integer point : points) {
            if (point >= 50 && point <= 100) {
                sumOfPassed += point;
            }
        }
        return sumOfPassed;
    }

    public int getCountOfPassed() {
        int countOfPassed = 0;
        for (Integer point : points) {
            if (point >= 50 && point <= 100) {
                countOfPassed++;
            }
        }
        return countOfPassed;
    }

    public double getAverage() {
        return (double) getSum() / points.size();
    }

    public double getAverageOfPassed() {
        return (double) getSumOfPassed() / getCountOfPassed();
    }

    public double getPassPercentage() {
        return (double) 100 * getCountOfPassed() / points.size();
    }

    private int pointsToGrades(int points) {
        int grade;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
