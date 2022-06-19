import Aero.Flight;
import Aero.FlightManager;
import Aero.Plane;
import Aero.TypeOfPlane;
import Personel.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void before(){
        plane = new Plane(TypeOfPlane.CESSNA);
        flight = new Flight(plane, "AB606", "LAX", "EDI",
                "20.30");
        flightManager = new FlightManager(flight, plane);
        passenger = new Passenger("Jojo", 2, flight);
    }
    @Test
    public void amountOfBaggageWeightTotal() {
        assertEquals(50, flightManager.getTotalBaggageWeight());
    }

    @Test
    public void amountOfBaggageWeightPerPerson(){
        assertEquals(25, flightManager.getBaggageAllowancePerPerson());
    }
    @Test
    public void findRemainingAMountOfBaggageAllowanceRemainingOnFlight(){
        flight.addPassengerToFlight(passenger, flight);
        assertEquals(25, flightManager.getRemainingLuggageCapacity());
    }
    @Test
    public void findRemainingAMountOfBaggageAllowanceRemainingOnFlightIfNoneRemains(){
        flight.addPassengerToFlight(passenger, flight);
        flight.addPassengerToFlight(passenger, flight);
        assertEquals(0, flightManager.getRemainingLuggageCapacity());
    }

}
