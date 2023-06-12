package Fundamentals_II.Part_11.Packages.flightControl;

import Fundamentals_II.Part_11.Packages.flightControl.logic.FlightControl;
import Fundamentals_II.Part_11.Packages.flightControl.ui.TextUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FlightControl fc = new FlightControl();
        Scanner sc = new Scanner(System.in);
        TextUI ui = new TextUI(fc, sc);

        ui.start();
    }
}
