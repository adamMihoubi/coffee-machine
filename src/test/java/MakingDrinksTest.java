import com.sun.org.apache.xpath.internal.operations.Or;
import domain.MakingDrinks;
import domain.Order;

import domain.delivery.Delivery;
import domain.delivery.Sugar;
import domain.delivery.drinks.Drink;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakingDrinksTest {

    private final static Double COFFEE_PRICE = 0.6;
    private final static Double CHOCOLATE_PRICE = 0.5;
    private final static Double TEA_PRICE = 0.4;

    @Test
    public void coffeeTestWith2Sugar() {
        //given
        String expectedMessage = "C:2:0";
        //when
        Delivery drink = MakingDrinks.makeADrink(Order.COFFEE, Sugar.TWO, COFFEE_PRICE);
        //then
        assertEquals(expectedMessage, drink.toString());
    }

    @Test
    public void coffeeTestWith1Sugar() {
        //given
        String expectedMessage = "C:1:0";
        //when
        Delivery drink = MakingDrinks.makeADrink(Order.COFFEE, Sugar.ONE, COFFEE_PRICE);
        //then
        assertEquals(expectedMessage, drink.toString());
    }

    @Test
    public void coffeeTestWithoutSugar() {
        //given
        String expectedMessage = "C::";
        //when
        Delivery drink = MakingDrinks.makeADrink(Order.COFFEE, Sugar.FREE, COFFEE_PRICE);
        //then
        assertEquals(expectedMessage, drink.toString());

    }

    @Test
    public void chocolateTestWith2Sugar() {
        //given
        String expectedMessage = "H:2:0";
        //when
        Delivery drink = MakingDrinks.makeADrink(Order.CHOCOLATE, Sugar.TWO, CHOCOLATE_PRICE);
        //then
        assertEquals(expectedMessage, drink.toString());
    }

    @Test
    public void chocolateTestWith1Sugar() {
        //given
        String expectedMessage = "H:1:0";
        //when
        Delivery drink = MakingDrinks.makeADrink(Order.CHOCOLATE, Sugar.ONE, CHOCOLATE_PRICE);
        //then
        assertEquals(expectedMessage, drink.toString());
    }

    @Test
    public void chocolateTestWithoutSugar() {
        //given
        String expectedMessage = "H::";
        //when
        Delivery drink = MakingDrinks.makeADrink(Order.CHOCOLATE, Sugar.FREE, CHOCOLATE_PRICE);
        //then
        assertEquals(expectedMessage, drink.toString());

    }

    @Test
    public void teaTestWith2Sugar() {
        //given
        String expectedMessage = "T:2:0";
        //when
        Delivery drink = MakingDrinks.makeADrink(Order.TEA, Sugar.TWO, TEA_PRICE);
        //then
        assertEquals(expectedMessage, drink.toString());
    }

    @Test
    public void teaTestWith1Sugar() {
        //given
        String expectedMessage = "T:1:0";
        //when
        Delivery drink = MakingDrinks.makeADrink(Order.TEA, Sugar.ONE, TEA_PRICE);
        //then
        assertEquals(expectedMessage, drink.toString());
    }

    @Test
    public void teaTestWithoutSugar() {
        //given
        String expectedMessage = "T::";
        //when
        Delivery drink = MakingDrinks.makeADrink(Order.TEA, Sugar.FREE, TEA_PRICE);
        //then
        assertEquals(expectedMessage, drink.toString());

    }

    @Test
    public void testNotEnoughMoneyForTea() {
        //given
        String expectedMessage = "M:not enough money provided, please add 0,10€";
        //when
        Delivery delivery = MakingDrinks.makeADrink(Order.TEA, Sugar.FREE, 0.3);
        //then
        assertEquals(expectedMessage, delivery.toString());

    }

    @Test
    public void testNotEnoughMoneyForCoffee() {
        //given
        String expectedMessage = "M:not enough money provided, please add 0,10€";
        //when
        Delivery delivery = MakingDrinks.makeADrink(Order.COFFEE, Sugar.FREE, 0.5);
        //then
        assertEquals(expectedMessage, delivery.toString());

    }

    @Test
    public void testNotEnoughMoneyForChocolate() {
        //given
        String expectedMessage = "M:not enough money provided, please add 0,10€";
        //when
        Delivery delivery = MakingDrinks.makeADrink(Order.CHOCOLATE, Sugar.FREE, 0.4);
        //then
        assertEquals(expectedMessage, delivery.toString());

    }

}
