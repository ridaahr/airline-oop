package org.ies.airline.model;

import java.util.Objects;

public class Passenger {
    private String Nif;
    private String name;
    private String surname;
    private Integer seatNumber;

    public Passenger(String nif, String name, String surname, Integer seatNumber) {
        Nif = nif;
        this.name = name;
        this.surname = surname;
        this.seatNumber = seatNumber;
    }

    public String getNif() {
        return Nif;
    }

    public void setNif(String nif) {
        Nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void passengerInfo() {
        System.out.println("NIF: " + getNif() + " .Nombre: " + getName() + " .Apellidos " + getSurname() + " .Asiento: " + getSeatNumber());
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "Nif='" + Nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", seatNumber=" + seatNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return Objects.equals(Nif, passenger.Nif) && Objects.equals(name, passenger.name) && Objects.equals(surname, passenger.surname) && Objects.equals(seatNumber, passenger.seatNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nif, name, surname, seatNumber);
    }
}
