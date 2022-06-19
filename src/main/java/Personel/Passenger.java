package Personel;

import Aero.Flight;

import java.util.Random;

public class Passenger {

    private String name;
    private int numberOfBags;
    private Flight flight;
    private int seatNumber;

    public Passenger(String name, int numberOfBags, Flight flight) {
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.flight = flight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    public Flight getFlight(){
        return this.flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int setSeatNumber(){
        int minSN = 1;
        int maxSN = flight.getPlane().getTypeOfPlane().getCapacity();
        int seatNumber = (int)Math.floor(Math.random()*(maxSN - minSN+1)+minSN);

        return this.seatNumber;
    }

    public int getSeatNumber() {
        return  this.seatNumber;
    }
}

