import org.junit.Before;
import org.junit.Test;
import themePark.Visitor;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor ("Keith Moon", 1.65, 100.00, 56);
    }

    @Test
    public void hasName() {
        assertEquals("Keith Moon", visitor.getName());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.65, visitor.getHeight(), 0.0001);
    }

    @Test
    public void hasMoney() {
        assertEquals(100, visitor.getMoney(), 0.0001);
    }

    @Test
    public void hasAge() {
        assertEquals(56, visitor.getAge ());
    }
}