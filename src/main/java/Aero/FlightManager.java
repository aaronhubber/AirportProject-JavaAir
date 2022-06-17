package Aero;

public class FlightManager {

    Flight flight;
    Plane plane;

    public FlightManager(Flight flight, Plane plane) {
        this.flight = flight;
        this.plane = plane;
    }

    public int getTotalBaggageWeight() {
        return this.plane.getTypeOfPlane().getWeight() / 2;
    }

    public int getBaggageAllowancePerPerson() {
        return this.getTotalBaggageWeight() / this.plane.getTypeOfPlane().getCapacity();
    }

    public int getRemainingLuggageCapacity() {
        return getTotalBaggageWeight() - getBaggageAllowancePerPerson() * flight.getNumberOfPassengers();
    }
}
