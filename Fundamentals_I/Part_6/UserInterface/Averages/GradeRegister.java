package Fundamentals_I.Part_6.UserInterface.Averages;

import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> examPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.examPoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.examPoints.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

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

    public double averageOfGrades() {
        //int count = 0;

        int sum = 0;
        for (int grades : grades) {
            sum += grades;
            //count++;
        }

        if (grades.isEmpty()) {
            return -1;
        }

        //return (double) sum / count;
        return (double) sum / this.grades.size();
    }

    public double averageOfPoints(){
        //int count = 0;

        int sum = 0;
        for (int points : examPoints) {
            sum += points;
            //count++;
        }

        if (examPoints.isEmpty()) {
            return -1;
        }

        return (double) sum / this.examPoints.size();
    }
}
