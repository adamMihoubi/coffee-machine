package domain;

import domain.delivery.Delivery;
import domain.delivery.Message;
import domain.delivery.Sugar;
import domain.delivery.SugarFree;
import domain.delivery.drinks.Chocolate;
import domain.delivery.drinks.Coffee;
import domain.delivery.drinks.Drink;
import domain.delivery.drinks.Tea;
import domain.exceptions.BadOrderException;


public class MakingDrinks {

    public static Delivery makeADrink(Order order) {
        switch (order.getFirstPart()) {
            case "C":
                return getDrink(order, new Coffee());
            case "T":
                return getDrink(order, new Tea());
            case "H":
                return getDrink(order, new Chocolate());
            case "M":
                return new Message();
            default:
                throw new BadOrderException();
        }
    }

    private static Delivery getDrink(Order order, Drink drink) {
        return order.getHasSecondPart() ?
                new Sugar(drink, order.getSecondPart()) :
                new SugarFree(drink);
    }

}
