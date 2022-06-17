import Personel.Pilot;
import Personel.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Victoria", Rank.CAPTAIN, "DF5667");
    }
    @Test
    public void hasLicenceNumber(){
        assertEquals("DF5667", pilot.getLicenceNumber());
    }
    @Test
    public void canChangLicenceNumber(){
        pilot.setLicenceNumber("DT1980");
        assertEquals("DT1980", pilot.getLicenceNumber());
    }
    @Test
    public void canFly(){
        assertEquals("Ready for takeoff", pilot.fly());
    }
}
