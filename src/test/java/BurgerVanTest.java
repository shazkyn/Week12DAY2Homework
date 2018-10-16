import stalls.BurgerVan;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BurgerVanTest {
    BurgerVan burgerVan;


    @Test
    public void hasName(){
        burgerVan= new BurgerVan ("Berts Burgers");
        assertEquals("Berts Burgers", burgerVan.getName());
    }
}
