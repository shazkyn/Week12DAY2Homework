import themePark.attractions.Dodgems;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {
    Dodgems dodgems;


    @Test
    public void hasName(){
        dodgems = new Dodgems ("Bumper to Bumper");
        assertEquals("Bumper to Bumper", dodgems.getName());
    }
}
