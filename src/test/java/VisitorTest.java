

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class VisitorTest {
   Visitor visitor;


    @Before
    public void before() {
        visitor = new Visitor("Keith Moon", 1.65, 100.00);
    }

    @Test
    public void hasName() {
        assertEquals("Keith Moon", visitor.getName());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.65, visitor.getHeight(), visitor.getMoney());
    }

    @Test
    public void hasMoney() {
        assertEquals(1.65, visitor.getHeight ( ) , visitor.getMoney());
    }

}




