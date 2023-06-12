package Fundamentals_I.Part_6.UserInterface.SimpleDictionary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI ui = new TextUI(sc, dictionary);
        ui.start();

        //System.out.println(dictionary.translate("pike"));
    }
}
