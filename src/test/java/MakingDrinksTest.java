import domain.MakingDrinks;
import domain.Order;

import domain.delivery.Sugar;
import domain.delivery.drinks.Drink;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakingDrinksTest {

    @Test
    public void coffeeTestWith2Sugar() {
        //given
        String expectedMessage = "C:2:0";
        //when
        Drink drink = MakingDrinks.makeADrink(Order.COFFEE, Sugar.TWO);
        //then
        assertEquals(expectedMessage, drink.toString());
    }

    @Test
    public void coffeeTestWith1Sugar() {
        //given
        String expectedMessage = "C:1:0";
        //when
        Drink drink = MakingDrinks.makeADrink(Order.COFFEE, Sugar.ONE);
        //then
        assertEquals(expectedMessage, drink.toString());
    }

    @Test
    public void coffeeTestWithoutSugar() {
        //given
        String expectedMessage = "C::";
        //when
        Drink drink = MakingDrinks.makeADrink(Order.COFFEE, Sugar.FREE);
        //then
        assertEquals(expectedMessage, drink.toString());

    }

    @Test
    public void chocolateTestWith2Sugar() {
        //given
        String expectedMessage = "H:2:0";
        //when
        Drink drink = MakingDrinks.makeADrink(Order.CHOCOLATE, Sugar.TWO);
        //then
        assertEquals(expectedMessage, drink.toString());
    }

    @Test
    public void chocolateTestWith1Sugar() {
        //given
        String expectedMessage = "H:1:0";
        //when
        Drink drink = MakingDrinks.makeADrink(Order.CHOCOLATE, Sugar.ONE);
        //then
        assertEquals(expectedMessage, drink.toString());
    }

    @Test
    public void chocolateTestWithoutSugar() {
        //given
        String expectedMessage = "H::";
        //when
        Drink drink = MakingDrinks.makeADrink(Order.CHOCOLATE, Sugar.FREE);
        //then
        assertEquals(expectedMessage, drink.toString());

    }

    @Test
    public void teaTestWith2Sugar() {
        //given
        String expectedMessage = "T:2:0";
        //when
        Drink drink = MakingDrinks.makeADrink(Order.TEA, Sugar.TWO);
        //then
        assertEquals(expectedMessage, drink.toString());
    }

    @Test
    public void teaTestWith1Sugar() {
        //given
        String expectedMessage = "T:1:0";
        //when
        Drink drink = MakingDrinks.makeADrink(Order.TEA, Sugar.ONE);
        //then
        assertEquals(expectedMessage, drink.toString());
    }

    @Test
    public void teaTestWithoutSugar() {
        //given
        String expectedMessage = "T::";
        //when
        Drink drink = MakingDrinks.makeADrink(Order.TEA, Sugar.FREE);
        //then
        assertEquals(expectedMessage, drink.toString());

    }

}
