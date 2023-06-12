package Fundamentals_I.Part_4.___ObjectsInAList.TelevisionPrograms;
/*
Implement a program that begins by reading television programs from the user.
When the user inputs an empty string as the name of the program, the program stops reading programs.

After this the user is queried for a maximum duration.
Once the maximum is given, the program proceeds to list all the programs
whose duration is smaller or equal to the specified maximum duration.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Duration: ");
            int duration = Integer.valueOf(sc.nextLine());

            programs.add(new TelevisionProgram(name, duration));
        }
        System.out.println();

        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(sc.nextLine());

        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= maxDuration) {
                System.out.println(program);
            }
        }
    }
}
