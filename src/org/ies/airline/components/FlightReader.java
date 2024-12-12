package org.ies.airline.components;

import org.ies.airline.model.Flight;
import org.ies.airline.model.Passenger;

import java.util.Scanner;

public class FlightReader {
    private final Scanner scanner;
    private final PassengerReader passengerReader;

    public FlightReader(Scanner scanner, PassengerReader passengerReader) {
        this.scanner = scanner;
        this.passengerReader = passengerReader;
    }

    public Flight read() {
        System.out.println("Número de vuelo:");
        var flightNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Origen:");
        var origin = scanner.nextLine();

        System.out.println("Destino:");
        var destination = scanner.nextLine();

        System.out.println("Puerta de embarque:");
        var gateNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Pasajeros:");
        System.out.println("¿Cuántos pasajeros hay?");
        var size = scanner.nextInt();
        scanner.nextLine();

        Passenger[] passengers = new Passenger[size];
        for (int i = 0; i < passengers.length; i++) {
            passengers[i] = passengerReader.read();
        }

        return new Flight(
                flightNumber,
                origin,
                destination,
                gateNumber,
                passengers
        );
    }
}
