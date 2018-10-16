import themePark.attractions.Playground;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;


    @Test
    public void hasName(){
        playground = new Playground ("Zombie Land");
        assertEquals("Zombie Land", playground.getName());
    }
}
