package Personel;



import Aero.Flight;

public class Passenger {

    private String name;
    private int numberOfBags;
    private Flight flight;

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

    public String getFlightInfo(){

            return this.flight.getFlightNumber();
        }
    }

