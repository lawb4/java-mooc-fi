package Fundamentals_I.Part_5.ObjectsAndReferences.DatingApp;

public class Main {
    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(13, 12, 2015);
        System.out.println("Friday of the examined week is " + date);

        SimpleDate newDate = date.afterNumberOfDays(7);

        for (int week = 1; week <= 7; week++) {
            System.out.println("Friday after " + week + " week is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
        }

        System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
        System.out.println("Try " + date.afterNumberOfDays(790));
    }
}
