import themePark.stalls.CandyFloss;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyflossTest {
    CandyFloss candyfloss;


    @Test
    public void hasName(){
        candyfloss= new CandyFloss("The Candy Man");
        assertEquals("The Candy Man", candyfloss.getName());
    }
}