import domain.MakingDrinks;
import domain.Order;
import domain.delivery.Delivery;
import domain.exceptions.BadOrderException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MakingDrinksTest {
    private static final Double COFFEE_PRICE = 0.6;
    private static final Double ORANGE_JUICE_PRICE = 0.6;
    private static final Double TEA_PRICE = 0.4;
    private static final Double CHOCOLATE_PRICE = 0.5;

    @Test
    public void coffeeTestWith2Sugar() {
        //given
        String expectedMessage = "Drink maker will make one coffee with two sugar and a stick";
        //when
        String order = "C:2:0";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), COFFEE_PRICE);
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }

    @Test
    public void coffeeTestWith1Sugar() {
        //given
        String expectedMessage = "Drink maker will make one coffee with one sugar and a stick";
        //when
        String order = "C:1:0";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), COFFEE_PRICE);
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }

    @Test
    public void coffeeTestWithoutSugar() {
        //given
        String expectedMessage = "Drink maker will make one coffee with no sugar";
        //when
        String order = "C::";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), COFFEE_PRICE);
        //then
        assertEquals(expectedMessage, delivery.getMessage());

    }

    @Test
    public void chocolateTestWith2Sugar() {
        //given
        String expectedMessage = "Drink maker will make one chocolate with two sugar and a stick";
        //when
        String order = "H:2:0";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), CHOCOLATE_PRICE);
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }

    @Test
    public void chocolateTestWith1Sugar() {
        //given
        String expectedMessage = "Drink maker will make one chocolate with one sugar and a stick";
        //when
        String order = "H:1:0";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), CHOCOLATE_PRICE);
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }

    @Test
    public void chocolateTestWithoutSugar() {
        //given
        String expectedMessage = "Drink maker will make one chocolate with no sugar";
        //when
        String order = "H::";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), CHOCOLATE_PRICE);
        //then
        assertEquals(expectedMessage, delivery.getMessage());

    }

    @Test
    public void teaTestWith2Sugar() {
        //given
        String expectedMessage = "Drink maker will make one tea with two sugar and a stick";
        //when
        String order = "T:2:0";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), TEA_PRICE);
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }

    @Test
    public void teaTestWith1Sugar() {
        //given
        String expectedMessage = "Drink maker will make one tea with one sugar and a stick";
        //when
        String order = "T:1:0";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), TEA_PRICE);
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }

    @Test
    public void teaTestWithoutSugar() {
        //given
        String expectedMessage = "Drink maker will make one tea with no sugar";
        //when
        String order = "T::";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), TEA_PRICE);
        //then
        assertEquals(expectedMessage, delivery.getMessage());

    }

    @Test
    public void hotTeaTestWith2Sugar() {
        //given
        String expectedMessage = "Drink maker will make an extra hot tea with two sugar and a stick";
        //when
        String order = "Th:2:0";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), TEA_PRICE);
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }

    @Test
    public void hotTeaTestWith1Sugar() {
        //given
        String expectedMessage = "Drink maker will make an extra hot tea with one sugar and a stick";
        //when
        String order = "Th:1:0";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), TEA_PRICE);
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }

    @Test
    public void hotTeaTestWithoutSugar() {
        //given
        String expectedMessage = "Drink maker will make an extra hot tea with no sugar";
        //when
        String order = "Th::";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), TEA_PRICE);
        //then
        assertEquals(expectedMessage, delivery.getMessage());

    }

    @Test
    public void hotChocolateTestWith2Sugar() {
        //given
        String expectedMessage = "Drink maker will make an extra hot chocolate with two sugar and a stick";
        //when
        String order = "Hh:2:0";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), CHOCOLATE_PRICE);
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }

    @Test
    public void hotChocolateTestWith1Sugar() {
        //given
        String expectedMessage = "Drink maker will make an extra hot chocolate with one sugar and a stick";
        //when
        String order = "Hh:1:0";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), CHOCOLATE_PRICE);
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }

    @Test
    public void hotChocolateTestWithoutSugar() {
        //given
        String expectedMessage = "Drink maker will make an extra hot chocolate with no sugar";
        //when
        String order = "Hh::";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), CHOCOLATE_PRICE);
        //then
        assertEquals(expectedMessage, delivery.getMessage());

    }

    @Test
    public void hotCoffeeTestWith2Sugar() {
        //given
        String expectedMessage = "Drink maker will make an extra hot coffee with two sugar and a stick";
        //when
        String order = "Ch:2:0";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), COFFEE_PRICE);
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }

    @Test
    public void hotCoffeeTestWith1Sugar() {
        //given
        String expectedMessage = "Drink maker will make an extra hot coffee with one sugar and a stick";
        //when
        String order = "Ch:1:0";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), COFFEE_PRICE);
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }

    @Test
    public void hotCoffeeTestWithoutSugar() {
        //given
        String expectedMessage = "Drink maker will make an extra hot coffee with no sugar";
        //when
        String order = "Ch::";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), COFFEE_PRICE);
        //then
        assertEquals(expectedMessage, delivery.getMessage());

    }

    @Test
    public void orangeTest() {
        //given
        String expectedMessage = "Drink maker will make one orange juice";
        //when
        String order = "O::";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), ORANGE_JUICE_PRICE);
        //then
        assertEquals(expectedMessage, delivery.getMessage());

    }

    @Test
    public void messageTest() {
        //given
        String expectedMessage = "Drink maker forwards any message received onto the coffee machine interface for the customer to see";
        //when
        String order = "M:message-content";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), 0d);
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }

    @Test
    public void badOrderTest() {
        //when
        String order = "L:";
        //then
        assertThrows(BadOrderException.class, () -> MakingDrinks.makeADrink(new Order(order), 0d));
    }


    @Test
    public void coffeeTestNotEnoughMoney() {
        //given
        String expectedMessage = "please add 0,20 €";
        //when
        String order = "C:2:0";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), 0.4);
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }

    @Test
    public void chocolateTestNotEnoughMoney() {
        //given
        String expectedMessage = "please add 0,10 €";
        //when
        String order = "H::";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), 0.4);
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }

    @Test
    public void teaTestNotEnoughMoney() {
        //given
        String expectedMessage = "please add 0,30 €";
        //when
        String order = "T::";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), 0.1);
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }

    @Test
    public void orangeJuiceTestNotEnoughMoney() {
        //given
        String expectedMessage = "please add 0,30 €";
        //when
        String order = "O::";
        Delivery delivery = MakingDrinks.makeADrink(new Order(order), 0.3);
        //then
        assertEquals(expectedMessage, delivery.getMessage());
    }


}
