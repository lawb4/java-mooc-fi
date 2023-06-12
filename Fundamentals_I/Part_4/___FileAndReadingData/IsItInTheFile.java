package Fundamentals_I.Part_4.___FileAndReadingData;
/*
Write a program that first asks the user for the name of the file to be read,
after which the user is prompted for the string that they're looking for.
The program then reads the file and searches for the desired string.

If the string is found, the program should print "Found!". If not, the program should print "Not found.".
If reading the file fails (the reading ends in an error) the program
should print the message "Reading the file " + file + " failed.".
 */
import java.nio.file.Paths;
import java.util.Scanner;


public class IsItInTheFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ArrayList<String> list = new ArrayList<>();

        System.out.println("Name of the file:");
        String fileName = sc.nextLine();

        System.out.println("Search for:");
        String stringSearch = sc.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (line.equals(stringSearch)){
                    System.out.println("Found!");
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }

        System.out.println("Not found.");

        /*try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                list.add(fileReader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }

        while (true) {
            if (list.contains(stringSearch)) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        }*/
    }
}/*Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        int lines = 0;
        try (Scanner fileReader = new Scanner(Paths.get(file))) {

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (!line.contains(searchedFor)) {
                    continue;
                }

                lines++;
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        if (lines == 0) {
            System.out.println("Not found.");
        } else {
            System.out.println("Found!");
        }

    }
}*/

