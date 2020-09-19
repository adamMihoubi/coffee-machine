import domain.MakingDrinks;
import domain.Order;
import domain.delivery.Delivery;
import domain.exceptions.BadOrderException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MakingDrinksTest {

    @Test
    public void coffeeTestWith2Sugar() {
        //given
        String expectedMessage = "Drink maker makes 1 coffee with 2 sugars and a stick";
        //when
        String order = "C:2:0";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order));
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }

    @Test
    public void coffeeTestWith1Sugar() {
        //given
        String expectedMessage = "Drink maker makes 1 coffee with 1 sugar and a stick";
        //when
        String order = "C:1:0";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order));
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }

    @Test
    public void coffeeTestWithoutSugar() {
        //given
        String expectedMessage = "Drink maker makes 1 coffee with no sugar - and therefore no stick";
        //when
        String order = "C::";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order));
        //then
        assertEquals(expectedMessage, delivery.getMessage());

    }

    @Test
    public void chocolateTestWith2Sugar() {
        //given
        String expectedMessage = "Drink maker makes 1 chocolate with 2 sugars and a stick";
        //when
        String order = "H:2:0";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order));
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }

    @Test
    public void chocolateTestWith1Sugar() {
        //given
        String expectedMessage = "Drink maker makes 1 chocolate with 1 sugar and a stick";
        //when
        String order = "H:1:0";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order));
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }

    @Test
    public void chocolateTestWithoutSugar() {
        //given
        String expectedMessage = "Drink maker makes 1 chocolate with no sugar - and therefore no stick";
        //when
        String order = "H::";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order));
        //then
        assertEquals(expectedMessage, delivery.getMessage());

    }

    @Test
    public void teaTestWith2Sugar() {
        //given
        String expectedMessage = "Drink maker makes 1 tea with 2 sugars and a stick";
        //when
        String order = "T:2:0";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order));
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }

    @Test
    public void teaTestWith1Sugar() {
        //given
        String expectedMessage = "Drink maker makes 1 tea with 1 sugar and a stick";
        //when
        String order = "T:1:0";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order));
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }

    @Test
    public void teaTestWithoutSugar() {
        //given
        String expectedMessage = "Drink maker makes 1 tea with no sugar - and therefore no stick";
        //when
        String order = "T::";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order));
        //then
        assertEquals(expectedMessage, delivery.getMessage());

    }

    @Test
    public void messageTest() {
        //given
        String expectedMessage = "Drink maker forwards any message received onto the coffee machine interface for the customer to see";
        //when
        String order = "M:message-content";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order));
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }

    @Test
    public void badOrderTest() {
        //when
        String order = "L:";
        //then
        assertThrows(BadOrderException.class, () -> MakingDrinks.makeADrink(new Order(order)));
    }
}
