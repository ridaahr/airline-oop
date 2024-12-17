package org.ies.airline;

import org.ies.airline.components.*;

import java.util.Scanner;

public class MainAirlineAppMenu {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var passengerReader = new PassengerReader(scanner);
        var flightReader = new FlightReader(scanner, passengerReader);
        var airlineReader = new AirlineReader(scanner, flightReader);
        var airlineAppMenu = new AirlineAppMenu(scanner, airlineReader);

        airlineAppMenu.run();
    }
}
