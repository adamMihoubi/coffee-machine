import domain.MakingDrinks;
import domain.Order;
import domain.delivery.Delivery;
import org.junit.jupiter.api.Test;
import services.BeverageQuantityChecker;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RunningOutTest {
    private static final Double TEA_PRICE = 0.4;

    @Test
    public void testShortages() {
        String expected = "shortage of water/milk";

        //given
        BeverageQuantityChecker beverageQuantityChecker = (s) -> true;

        //when
        MakingDrinks.setBeverageQuantityChecker(beverageQuantityChecker);
        Delivery delivery = MakingDrinks.makeADrink(new Order("T::"), TEA_PRICE);

        //then
        assertEquals(expected,delivery.getMessage());

    }
}
