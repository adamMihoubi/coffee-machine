import domain.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderTest {

    @Test
    public void OrderTestWithSugarAndStick() {
        Order order = new Order("C:2:0");
        String expectedDrinkType = "C";
        assertEquals(expectedDrinkType, order.getFirstPart());
        assertTrue(order.getHasSecondPart());
    }

    @Test
    public void OrderTestWithoutSugarAndStick() {
        Order order = new Order("C::");
        String expectedDrinkType = "C";
        assertEquals(expectedDrinkType, order.getFirstPart());
        assertFalse(order.getHasSecondPart());
    }

}
