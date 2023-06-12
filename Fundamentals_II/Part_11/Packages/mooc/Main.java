package Fundamentals_II.Part_11.Packages.mooc;

import Fundamentals_II.Part_11.Packages.mooc.logic.ApplicationLogic;
import Fundamentals_II.Part_11.Packages.mooc.ui.TextInterface;
import Fundamentals_II.Part_11.Packages.mooc.ui.UserInterface;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello packages!");
        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
