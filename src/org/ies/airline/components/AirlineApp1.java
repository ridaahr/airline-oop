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

        var flight = airline.findFlight(flightNumber);
        if (flight == null) {
            System.out.println("No existe el vuelo");
        } else {
            System.out.println("Introduce el nif del pasajero");
            var nif = scanner.nextLine();
            var passenger = flight.findPassenger(nif);
            if (passenger == null) {
                System.out.println("No existe el pasajero");
            } else {
                passenger.passengerInfo();
                System.out.println("Introduce un número de asiento");
                var seatNumber = scanner.nextInt();
                scanner.nextLine();
                passenger.setSeatNumber(seatNumber);
                passenger.passengerInfo();
            }
        }
    }
}
