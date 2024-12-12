package org.ies.airline.components;

import org.ies.airline.model.Passenger;

import java.util.Scanner;

public class PassengerReader {
    private final Scanner scanner;

    public PassengerReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Passenger read() {
        System.out.println("Introduce el NIF:");
        var nif = scanner.nextLine();

        System.out.println("Introduce el nombre:");
        var name = scanner.nextLine();

        System.out.println("Introduce los apellidos:");
        var surname = scanner.nextLine();

        System.out.println("Elige el asiento");
        var seatNumber = scanner.nextInt();
        scanner.nextLine();

        return new Passenger(
                nif,
                name,
                surname,
                seatNumber
        );
    }
}
