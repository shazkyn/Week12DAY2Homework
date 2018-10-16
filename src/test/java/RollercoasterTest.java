import attractions.Rollercoaster;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {
    Rollercoaster rollercoaster;


    @Test
    public void hasName(){
        rollercoaster = new Rollercoaster("Big Zed");
        assertEquals("Big Zed", rollercoaster.getName());
    }
}
