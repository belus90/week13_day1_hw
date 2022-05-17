package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;


    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(16,189.34,65.23);
        visitor2 = new Visitor(7,123.34,25.64);
        visitor3 = new Visitor(24, 214, 55.12);
    }


    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasAllowedTo(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
        assertEquals(false,rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void hasToPayDouble(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor1),0.00);
        assertEquals(16.8,rollerCoaster.priceFor(visitor3), 0.00);
    }
}
