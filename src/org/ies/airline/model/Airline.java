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

    public Flight askFlight(int flightNumber) {
        for (var flight: flights) {
            if (flight.getFlightNumber() == flightNumber) {
                return flight;
            }
        }   return null;
    }

    public void flightCheck(int flightNumber) {
        var scanner = new Scanner(System.in):
        var flight = askFlight(flightNumber);

        if (flight == null) {
            System.out.println("No existe el vuelo");
        } else {
            System.out.println("Introduce el nif del pasajero:");
            var nif = scanner.nextLine();
            Flight.checkPassenger(nif);
        }
    }

    public void askPassenger(String nif) {
        if
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
