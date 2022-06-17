import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(TypeOfPlane.AIRBUS_A350);
    }
    @Test
    public void hasPlaneType(){
        assertEquals(TypeOfPlane.AIRBUS_A350, plane.getTypeOfPlane());
    }
    @Test
    public void canChangeTypeOfPlane(){
        plane.setTypeOfPlane(TypeOfPlane.ATR_42);
        assertEquals(TypeOfPlane.ATR_42, plane.getTypeOfPlane());
    }

}
