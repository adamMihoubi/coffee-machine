package domain.delivery;

import domain.delivery.drinks.Drink;

public class Hot extends Drink {
    private final Drink drink;

    public Hot(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getMessage() {
        return String.join(" ",
                "Drink maker will make an extra hot",
                drink.getName());
    }
}
