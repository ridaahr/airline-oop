package org.ies.airline.components;

import org.ies.airline.model.Airline;
import org.ies.airline.model.Flight;

import java.util.Scanner;

public class AirlineApp1 {
    private final Scanner scanner;
    private final AirlineReader airlineReader;

    public AirlineApp1(Scanner scanner, AirlineReader airlineReader) {
        this.scanner = scanner;
        this.airlineReader = airlineReader;
    }

    public void run() {
        var airline = airlineReader.read();

        System.out.println("Introduce un número de vuelo");
        var flightNumber = scanner.nextInt();
        scanner.nextLine();

        Airline.
    }
}
