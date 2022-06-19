import Aero.Flight;
import Aero.Plane;
import Personel.Passenger;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Flight flight;
    Plane plane;

    @Before
    public void before(){
        flight = new Flight(plane, "CF23", "LDN", "INV", "1900");
        passenger1 = new Passenger("Barry", 1, flight );
        passenger2 = new Passenger("Fisher", 3, flight);
        passenger3 = new Passenger("Gwen", 5, flight);
    }
    @Test
    public void hasName(){
        assertEquals("Barry", passenger1.getName());
    }

    @Test
    public void canChangeName() {
        passenger1.setName("Keith");
        assertEquals("Keith", passenger1.getName());
    }
    @Test
    public void hasBags(){
        assertEquals(1, passenger1.getNumberOfBags());
    }

    @Test
    public void canChangeNumberOfBags() {
        passenger1.setNumberOfBags(2);
        assertEquals(2, passenger1.getNumberOfBags());
    }
    @Test
    public void canCheckFlightInfo(){
        assertEquals(flight, passenger1.getFlight());
    }
    @Test
    public void checkSeatNumber(){
        flight.addPassengerToFlight(passenger1, flight);
        assertEquals(1, passenger1.getSeatNumber());
    }


}
