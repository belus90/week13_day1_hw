package attractions;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor1 = new Visitor(23, 175.65,34.23);
        visitor2 = new Visitor(4, 87.32, 24.34);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasToPayDouble(){
        assertEquals(4.50, dodgems.priceFor(visitor1),0.00);
        assertEquals(2.25,dodgems.priceFor(visitor2), 0.00);
    }

}
