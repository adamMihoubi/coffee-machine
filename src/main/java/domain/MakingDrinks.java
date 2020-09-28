package domain;

import domain.delivery.Sugar;
import domain.delivery.drinks.Chocolate;
import domain.delivery.drinks.Coffee;
import domain.delivery.drinks.Drink;
import domain.delivery.drinks.Tea;
import domain.exceptions.BadOrderException;


public class MakingDrinks {

    public static Drink makeADrink(Order order, Sugar sugar) {
        switch (order) {
            case COFFEE:
                return new Coffee(sugar);
            case TEA:
                return new Tea(sugar);
            case CHOCOLATE:
                return new Chocolate(sugar);
        }
        throw new BadOrderException();
    }

}
