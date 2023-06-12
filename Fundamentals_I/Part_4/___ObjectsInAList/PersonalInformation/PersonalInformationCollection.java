package Fundamentals_I.Part_4.___ObjectsInAList.PersonalInformation;
/*
The program described here should be implemented in the class PersonalInformationCollection.
NB! Do not modify the class PersonalInformation.

After the user has entered the last set of details (they enter an empty first name), exit the repeat statement.

Then print the collected personal information so that each entered object is printed in the following format:
first and last names separated by a space (you don't print the identification number).
 */
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {
    public static void main(String[] args) {
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("First Name: ");
            String firstName = sc.nextLine();
            if (firstName.isEmpty()) {
                break;
            }

            System.out.print("Last Name: ");
            String lastName = sc.nextLine();
            System.out.print("Identification number: ");
            String id = sc.nextLine();

            infoCollection.add(new PersonalInformation(firstName, lastName, id));
        }
        System.out.println();

        for (PersonalInformation person : infoCollection) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }
    }
}
