import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        passenger1 = new Passenger("Barry", 1);
        passenger2 = new Passenger("Fisher", 3);
        passenger3 = new Passenger("Gwen", 5);
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
}
