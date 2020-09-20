package domain;

import domain.delivery.Delivery;
import domain.delivery.Hot;
import domain.delivery.Message;
import domain.delivery.Sugar;
import domain.delivery.SugarFree;
import domain.delivery.drinks.Chocolate;
import domain.delivery.drinks.Coffee;
import domain.delivery.drinks.Drink;
import domain.delivery.drinks.OrangeJuice;
import domain.delivery.drinks.Tea;
import domain.exceptions.BadOrderException;

import java.util.HashMap;
import java.util.Map;


public class MakingDrinks {
    private static final Map<String, Double> soldDrinks = new HashMap<>();
    private static final Map<String, Integer> numberOfSoldDrinks = new HashMap<>();

    public static Delivery makeADrink(Order order, Double money) {
        switch (order.getFirstPart()) {
            case "C":
                return getDrink(order, new Coffee(), money);
            case "T":
                return getDrink(order, new Tea(), money);
            case "H":
                return getDrink(order, new Chocolate(), money);
            case "M":
                return new Message();
            case "O":
                return getOrangeJuice(new OrangeJuice(), money);
            case "Th":
                return getHotDrink(order, new Tea(), money);
            case "Hh":
                return getHotDrink(order, new Chocolate(), money);
            case "Ch":
                return getHotDrink(order, new Coffee(), money);
            default:
                throw new BadOrderException();
        }
    }

    private static Delivery getDrink(Order order, Drink drink, Double money) {
        if (drink.verifyPrice(money)) {
            register(drink);
            return order.getHasSecondPart() ?
                    new Sugar(drink, order.getSecondPart()) :
                    new SugarFree(drink);
        } else {
            return new Message(defaultMessage(drink, money));
        }
    }

    private static Delivery getHotDrink(Order order, Drink drink, Double money) {
        if (drink.verifyPrice(money)) {
            register(drink);
            return order.getHasSecondPart() ?
                    new Sugar(new Hot(drink), order.getSecondPart()) :
                    new SugarFree(new Hot(drink));
        } else {
            return new Message(defaultMessage(drink, money));
        }
    }

    private static Delivery getOrangeJuice(Drink drink, Double money) {
        return (drink.verifyPrice(money)) ? register(drink) : new Message(defaultMessage(drink, money));
    }

    private static String defaultMessage(Drink drink, Double money) {
        return String.format("please add %.2f €", drink.getPrice() - money);
    }

    private static Drink register(Drink drink) {
        soldDrinks.compute(drink.getName(), (key, value) -> value == null ? drink.getPrice() : value + drink.getPrice());
        numberOfSoldDrinks.compute(drink.getName(), (key, value) -> value == null ? 1 : ++value);
        return drink;
    }

    public static Map<String, Integer> getNumberOfSoldDrinks() {
        return numberOfSoldDrinks;
    }

    public static Double getTotalMoneyEarned() {
        return soldDrinks.values().stream().mapToDouble(Double::doubleValue).sum();
    }
}
