package org.ies.airline.components;

import java.util.Scanner;

public class AirlineAppMenu {
    private final Scanner scanner;
    private final AirlineReader airlineReader;

    public AirlineAppMenu(Scanner scanner, AirlineReader airlineReader) {
        this.scanner = scanner;
        this.airlineReader = airlineReader;
    }

    public void run() {
        var airline = airlineReader.read();
        int option;
        do {
            System.out.println("Elige una opción:");
            System.out.println("1. Mostrar todos los vuelos");
            System.out.println("2. Mostrar vuelos origen");
            System.out.println("3. Mostrar vuelos de un pasajero");
            System.out.println("4. Mostrar asiento de un pasajero");
            System.out.println("5. Cambiar asiento de un pasajero");
            System.out.println("6. Salir");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                airline.showFlights();
            }
            else if (option == 2) {
                System.out.println("Introduce el origen");
                var origin = scanner.nextLine();
                airline.originFlight(origin);
            }
            else if (option == 3) {
                System.out.println("Introduce el nif");
                var nif = scanner.nextLine();
                airline.passengerFlight(nif);
            }
            else if (option == 4) {
                System.out.println("Introduce el número de vuelo");
                var flightNumber = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Introduce el nif");
                var nif = scanner.nextLine();
                var seat = airline.passengerSeat(flightNumber, nif);
                var flight = airline.findFlight(flightNumber);
                if (flight == null) {
                    System.out.println("No existe el vuelo");
                } else {
                    var passenger = flight.findPassenger(nif);
                    if (passenger == null) {
                        System.out.println("El pasajero no está registrado");
                    } else {
                        System.out.println("El asiento asignado es: " + passenger.getSeatNumber());
                    }
                }
            }
            else if (option == 5) {
                System.out.println("Introduce el número de vuelo");
                var flightNumber = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Introduce el nif");
                var nif = scanner.nextLine();

                System.out.println("Introduce un asiento");
                var seatNumber = scanner.nextInt();
                scanner.nextLine();

                var flight = airline.findFlight(flightNumber);
                if (flight == null) {
                    System.out.println("No existe el vuelo");
                } else {
                    var passenger = flight.findPassenger(nif);
                    if (passenger == null) {
                        System.out.println("El pasajero no está registrado");
                    } else {
                        airline.updateSeatNumber(flightNumber, nif, seatNumber);
                        System.out.println("Asiento asignado");
                    }
                }
            }
        } while (option != 6);
    }
}
