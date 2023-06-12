package Fundamentals_II.Part_11.Packages.flightControl.ui;

import Fundamentals_II.Part_11.Packages.flightControl.logic.FlightControl;
import Fundamentals_II.Part_11.Packages.flightControl.domain.Flight;
import Fundamentals_II.Part_11.Packages.flightControl.domain.Airplane;

import java.util.Scanner;

public class TextUI {

    private FlightControl flightControl;
    private Scanner sc;

    public TextUI(FlightControl flightControl, Scanner sc) {
        this.flightControl = flightControl;
        this.sc = sc;
    }

    public void start(){
        startAssetControl();
        System.out.println();
        startFlightControl();
        System.out.println();
    }

    private void startAssetControl(){
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();

        label:
        while (true){
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            System.out.print("> ");
            String answer = sc.nextLine();

            switch (answer) {
                case "1":
                    addAirplane();
                    break;
                case "2":
                    addFlight();
                    break;
                case "x":
                    break label;
                /*default:
                    System.out.println("Wrong command! Try again!");
                    break;*/
            }
        }
    }

    private void addAirplane(){
        System.out.print("Give the airplane id: ");
        String id = sc.nextLine();
        System.out.print("Give the airplane capacity: ");
        int capacity = Integer.parseInt(sc.nextLine());

        this.flightControl.addAirplane(id, capacity);
        System.out.println();
    }

    private void addFlight(){
        System.out.print("Give the airplane id: ");
        Airplane airplane = askForAirplane();
        System.out.print("Give the departure airport id: ");
        String departureID = sc.nextLine();
        System.out.print("Give the target airport id: ");
        String destinationID = sc.nextLine();

        this.flightControl.addFlight(airplane, departureID, destinationID);
        System.out.println();
    }

    private void startFlightControl(){
        System.out.println("Flight Control");
        System.out.println("-------------");
        System.out.println();

        label:
        while (true) {
            System.out.println("Choose an action: ");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            System.out.print("> ");
            String answer = sc.nextLine();
            switch (answer) {
                case "1":
                    printAirplanes();
                    break;
                case "2":
                    printFlights();
                    break;
                case "3":
                    printAirplaneDetails();
                    break;
                case "x":
                    break label;
                /*default:
                    System.out.println("Wrong command! Try again!");
                    break;*/
            }
        }
    }

    private void printAirplanes(){
        for (Airplane plane : flightControl.getAirplanes()){
            System.out.println(plane);
        }
        System.out.println();
    }

    private void printFlights(){
        for (Flight flight : flightControl.getFlights()){
            System.out.println(flight);
        }
        System.out.println();
    }

    private void printAirplaneDetails(){
        System.out.print("Give the airplane id: ");
        Airplane plane = askForAirplane();
        System.out.println(plane);
        System.out.println();
    }

    private Airplane askForAirplane(){
        Airplane airplane = null;
        while (airplane == null){
            String id = sc.nextLine();
            airplane = flightControl.getAirplane(id);

            if (airplane == null){
                System.out.println("No airplane with the id " + id + ".");
            }
        }

        return airplane;
    }
}
