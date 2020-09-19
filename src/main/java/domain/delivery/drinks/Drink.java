package domain.delivery.drinks;

import domain.delivery.Delivery;

public abstract class Drink implements Delivery {
    protected Double price;

    public String getMessage() {
        return "Drink maker makes 1";
    }

    public Boolean verifyPrice(Double moneyInserted) {
        return moneyInserted >= price;
    }

    public Double getPrice() {
        return price;
    }
}
