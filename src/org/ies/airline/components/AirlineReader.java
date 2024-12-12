package org.ies.airline.components;

import org.ies.airline.model.Airline;
import org.ies.airline.model.Flight;

import java.util.Scanner;

public class AirlineReader {
    private final Scanner scanner;
    private final FlightReader flightReader;

    public AirlineReader(Scanner scanner, FlightReader flightReader) {
        this.scanner = scanner;
        this.flightReader = flightReader;
    }

    public Airline read() {
        System.out.println("Introduce el nombre de la aerolínea:");
        var name = scanner.nextLine();

        System.out.println("Indique los vuelos:");
        System.out.println("¿Cuántos vuelos hay?");
        var size = scanner.nextInt();
        scanner.nextLine();

        Flight[] flights = new Flight[size];
        for (int i = 0; i < flights.length; i++) {
            flights[i] = flightReader.read();
        }

        return new Airline(
                name,
                flights
        );
    }
}
