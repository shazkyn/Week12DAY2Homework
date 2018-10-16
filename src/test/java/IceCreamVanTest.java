import themePark.stalls.IceCreamVan;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamVanTest {
    IceCreamVan iceCreamVan;


    @Test
    public void hasName(){
        iceCreamVan= new IceCreamVan ("Sweeties for U");
        assertEquals("Sweeties for U", iceCreamVan.getName());
    }
}