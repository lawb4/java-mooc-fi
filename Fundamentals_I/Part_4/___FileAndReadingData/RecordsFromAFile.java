package Fundamentals_I.Part_4.___FileAndReadingData;
/*
Your task is to write a program that first prompts the user for the name of the file they want to read.
The program then prints the content of the file in the following way
(we're assuming below that the output is from the above-mentioned file):

lily,3
anton,5
levi,4
amy,1
 */

import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = sc.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()){
                String line = fileReader.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                String age = parts[1];

                String year  = "years";
                if (age.equals("1")){
                    year = "year";
                }
                System.out.println(name + ", " + "age: " + age + " " + year);

                /* The MOOC's solution:

                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                if (age == 1) {
                    System.out.println(name + ", age: " + age + " year");
                } else {
                    System.out.println(name + ", age: " + age + " years");
                }*/
            }
        } catch (Exception e){
            System.out.println("Error reading file");
        }
    }
}
