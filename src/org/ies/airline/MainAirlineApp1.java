package org.ies.airline;

import org.ies.airline.components.AirlineApp1;
import org.ies.airline.components.AirlineReader;
import org.ies.airline.components.FlightReader;
import org.ies.airline.components.PassengerReader;

import java.util.Scanner;

public class MainAirlineApp1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var passengerReader = new PassengerReader(scanner);
        var flightReader = new FlightReader(scanner, passengerReader);
        var airlineReader = new AirlineReader(scanner, flightReader);
        var airlineApp1 = new AirlineApp1(scanner, airlineReader);

        airlineApp1.run();
    }
}