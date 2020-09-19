package domain.delivery;

import domain.delivery.drinks.Drink;

public class SugarFree extends Drink {

    private Drink drink;

    public SugarFree(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getMessage() {
        return String.join(" ",
                drink.getMessage(),
                "with no sugar - and therefore no stick");
    }
}
