package domain;

import domain.delivery.Delivery;
import domain.delivery.Message;
import domain.delivery.Sugar;
import domain.delivery.drinks.Chocolate;
import domain.delivery.drinks.Coffee;
import domain.delivery.drinks.Drink;
import domain.delivery.drinks.Tea;
import domain.exceptions.BadOrderException;


public class MakingDrinks {

    public static Delivery makeADrink(Order order, Sugar sugar, Double money) {
        switch (order) {
            case COFFEE:
                return getDrink(order, money, new Coffee(sugar));
            case TEA:
                return getDrink(order, money, new Tea(sugar));
            case CHOCOLATE:
                return getDrink(order, money, new Chocolate(sugar));
        }
        throw new BadOrderException();
    }

    private static Delivery getDrink(Order order, Double money, Drink drink) {
        return checkIfEnoughMoney(order, money) ?
                drink :
                new Message(String.format("not enough money provided, please add %.2f€"
                        , order.getPrice() - money));

    }

    private static Boolean checkIfEnoughMoney(Order order, Double money) {
        return money >= order.getPrice();
    }

}
