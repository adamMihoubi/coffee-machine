package domain.delivery.drinks;

import domain.delivery.Delivery;

public abstract class Drink implements Delivery {

    public String getMessage() {
        return "Drink maker makes 1";
    }
}
