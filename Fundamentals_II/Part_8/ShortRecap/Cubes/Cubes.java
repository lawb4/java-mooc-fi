package Fundamentals_II.Part_8.ShortRecap.Cubes;

import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();

            if (input.equals("end")) {
                break;
            }

            int num = Integer.valueOf(input);
            int volume = num * num * num;

            System.out.println(volume);
        }
    }
}
