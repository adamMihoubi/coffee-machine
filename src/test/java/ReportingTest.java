import domain.MakingDrinks;
import domain.Order;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReportingTest {
    private static final Double COFFEE_PRICE = 0.6;
    private static final Double ORANGE_JUICE_PRICE = 0.6;
    private static final Double TEA_PRICE = 0.4;
    private static final Double CHOCOLATE_PRICE = 0.5;

    @Test
    public void testReportingMap() {
        MakingDrinks.setBeverageQuantityChecker((s) -> false);
        //given
        Map<String, Integer> expected = new HashMap<>();
        //4 coffee
        expected.put("coffee", 4);
        //2 tea
        expected.put("tea", 2);
        //2 chocolate
        expected.put("chocolate", 2);
        //4 orange juice
        expected.put("orange juice", 4);

        Double expectedTotal = 6.6;


        MakingDrinks.makeADrink(new Order("O::"), ORANGE_JUICE_PRICE);
        MakingDrinks.makeADrink(new Order("O::"), ORANGE_JUICE_PRICE);
        MakingDrinks.makeADrink(new Order("O::"), ORANGE_JUICE_PRICE);
        MakingDrinks.makeADrink(new Order("O::"), ORANGE_JUICE_PRICE);
        MakingDrinks.makeADrink(new Order("C::"), COFFEE_PRICE);
        MakingDrinks.makeADrink(new Order("C::"), COFFEE_PRICE);
        MakingDrinks.makeADrink(new Order("C::"), COFFEE_PRICE);
        MakingDrinks.makeADrink(new Order("C::"), COFFEE_PRICE);
        MakingDrinks.makeADrink(new Order("T::"), TEA_PRICE);
        MakingDrinks.makeADrink(new Order("T::"), TEA_PRICE);
        MakingDrinks.makeADrink(new Order("H::"), CHOCOLATE_PRICE);
        MakingDrinks.makeADrink(new Order("H::"), CHOCOLATE_PRICE);

        assertEquals(expected, MakingDrinks.getNumberOfSoldDrinks());
        assertEquals(expectedTotal, MakingDrinks.getTotalMoneyEarned());
    }
}
