import themePark.attractions.Park;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {
    Park park;

    @Test
    public void hasName(){
        park = new Park ("Park Life");
        assertEquals("Park Life", park.getName());
    }
}
