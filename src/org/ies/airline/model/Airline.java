package org.ies.airline.model;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Airline {
    private String name;
    private Flight[] flights;

    public Airline(String name, Flight[] flights) {
        this.name = name;
        this.flights = flights;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flight[] getFlights() {
        return flights;
    }

    public void setFlights(Flight[] flights) {
        this.flights = flights;
    }


//    public void flightCheck(int flightNumber) {
//        Scanner scanner = new Scanner(System.in);
//        var flight = findFlight(flightNumber);
//
//        if (flight == null) {
//            System.out.println("No existe el vuelo");
//        } else {
//            System.out.println("Introduce el nif del pasajero");
//            var nif = scanner.nextLine();
//            flight.checkPassenger(nif);
//            System.out.println("Introduce un asiento");
//            var seatNumber = scanner.nextInt();
//            scanner.nextLine();
//            flight.seatPassenger(seatNumber);
//        }
//    }

    public void showFlights() {
        for (var flight : flights) {
            flight.flightInfo();
        }
    }

    public Flight findFlight(int flightNumber) {
        for (var flight : flights) {
            if (flight.getFlightNumber() == flightNumber) {
                return flight;
            }
        }
        return null;
    }

    public void originFlight(String origin) {
        for (var flight : flights) {
            if (flight.getOrigin().equals(origin)) {
                flight.flightInfo();
            }
        }
    }

    public void passengerFlight(String nif) {
        for (var flight : flights) {
            var passenger = flight.findPassenger(nif);
            if (passenger != null) {
                flight.flightInfo();
            } else {
                System.out.println("No hay vuelos para este pasajero");
            }
        }
    }

    public void seatPassenger(Integer flightNumber, String nif) {
        for (var flight : flights) {
            if (flight.getFlightNumber() == flightNumber) {
                var passenger = flight.nifPassenger(nif);
                if (passenger != null) {
                    System.out.println("El asiento asignado es: " + passenger.getSeatNumber());
                }
            } else {
                System.out.println("No existen vuelos");
            }
        }
    }

    public Integer passengerSeat(Integer flightNumber, String nif) {
        for (var flight : flights) {
            var passenger = flight.findPassenger(nif);
            if (passenger != null) {
                return passenger.getSeatNumber();
            } else {
                System.out.println("No existe el pasajero");
            }
        }
        return null;
    }

    public void updateSeatNumber(int flightNumber, String nif, int seatNumber) {
        var flight = findFlight(flightNumber);
        if (flight == null) {
            System.out.println("No existe el vuelo");
        } else {
            var passenger = flight.findPassenger(nif);
            if (passenger == null) {
                System.out.println("No hay pasajero");
            } else {
                passenger.setSeatNumber(seatNumber);
            }
        }
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                ", flights=" + Arrays.toString(flights) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(name, airline.name) && Objects.deepEquals(flights, airline.flights);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(flights));
    }
}
