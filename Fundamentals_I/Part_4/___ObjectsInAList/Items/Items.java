package Fundamentals_I.Part_4.___ObjectsInAList.Items;
/*
Implement the class Items described here. NB! Don't modify the class Item.

Write a program that reads names of items from the user.
If the name is empty, the program stops reading.
Otherwise, the given name is used to create a new item, which you will then add to the items list.

Having read all the names, print all the items by using the toString method of the Item class.
The implementation of the Item class keeps track of the time of creation, in addition to the name of the item.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Items {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String inputItemName = sc.nextLine();
            if (inputItemName.isEmpty()) {
                break;
            }

            items.add(new Item(inputItemName));
        }

        System.out.println();
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
