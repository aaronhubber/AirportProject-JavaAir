package Aero;

import Personel.CabinCrewMember;
import Personel.Passenger;
import Personel.Pilot;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> crew;
    private ArrayList<Passenger> passengerList;
    private Plane plane;
    private String flightNumber;
    private String destinationAirport;
    private String departureAirport;
    private String timeOfDeparture;

    public Flight( Plane plane, String flightNumber, String destinationAirport, String departureAirport, String timeOfDeparture) {
        this.pilots = new ArrayList<>();
        this.crew = new ArrayList<>();
        this.passengerList = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.timeOfDeparture = timeOfDeparture;
    }


    public void addPassengerToFlight(Passenger passenger) {
        if (passengerList.size() < plane.getTypeOfPlane().getCapacity()) {
            this.passengerList.add(passenger);
        }

    }

    public int getNumberOfPassengers() {
        return this.passengerList.size();
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public int getRemainingSeats(Plane plane) {
        if (plane.getTypeOfPlane().capacity >= this.passengerList.size()) {
            return plane.getTypeOfPlane().capacity - this.passengerList.size();
        }
        else{
            return 000;
        }
    }}



