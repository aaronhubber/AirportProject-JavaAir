import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Flight flight2;
    Plane plane1;
    Plane plane2;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void before(){
        plane1 = new Plane(TypeOfPlane.AIRBUS_A350);
        plane2 = new Plane(TypeOfPlane.BOEING_747);
        flight = new Flight(plane1, "AB606", "LAX", "EDI",
                "20.30");
        flight2 = new Flight(plane2, "BO111", "SHA", "GLA",
                "14.10");
        passenger1 = new Passenger("Greg", 2);
        passenger2 = new Passenger("Sophie", 9);
    }
    @Test
    public void getNumberOfPassengersOnFight(){
        flight.addPassengerToFlight(passenger1);
        assertEquals(1, flight.getNumberOfPassengers());
    }
    @Test
    public void getNumberOfRemainingSeats(){
        flight.addPassengerToFlight(passenger1);
        flight.addPassengerToFlight(passenger1);
        flight.addPassengerToFlight(passenger1);
        flight.addPassengerToFlight(passenger1);
        assertEquals(96, flight.getRemainingSeats(plane2));
    }
    @Test
    public void getNumberOfRemainingSeatsIfNoCapacity(){
        Plane plane = new Plane(TypeOfPlane.CESSNA);
        flight.addPassengerToFlight(passenger1);
        flight.addPassengerToFlight(passenger1);
        flight.addPassengerToFlight(passenger1);
        assertEquals(000, flight.getRemainingSeats(plane));
    }
}
