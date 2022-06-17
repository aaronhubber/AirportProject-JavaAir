import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;

    @Before
    public void before(){
        cabinCrewMember1 = new CabinCrewMember("Greta", Rank.CAPTAIN);
        cabinCrewMember2 = new CabinCrewMember("Alan", Rank.FIRST_OFFICER);
        cabinCrewMember2 = new CabinCrewMember("Hope", Rank.FLIGHT_ATTENDANT);
    }
    @Test
    public void hasName(){
        assertEquals("Greta", cabinCrewMember1.getName());
    }
    @Test
    public void canChangeName(){
        cabinCrewMember1.setName("Wally");
        assertEquals("Wally", cabinCrewMember1.getName());
    }
    @Test
    public void hasRank(){
        assertEquals(Rank.CAPTAIN, cabinCrewMember1.getRank());
    }
    @Test
    public void canChangeRank(){
        cabinCrewMember1.setRank(Rank.FLIGHT_ATTENDANT);
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrewMember1.getRank());
    }
    @Test
    public void canRelayMessagesToPassenger(){
        assertEquals("Please sit down!", cabinCrewMember1.tellPassengerOff());
    }

}
