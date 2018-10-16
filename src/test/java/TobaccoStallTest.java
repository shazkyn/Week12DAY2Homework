import org.junit.Before;
import themePark.stalls.TobaccoStall;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {
   TobaccoStall tobaccoStall;


    @Before
    public void before() {
        tobaccoStall = new TobaccoStall ("Sandy's Cgars");
    }

    @Test
    public void hasName(){
        assertEquals("Sandy's Cgars", tobaccoStall.getName());
    }


}
