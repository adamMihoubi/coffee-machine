package domain.delivery.drinks;

import domain.delivery.Delivery;

public abstract class Drink implements Delivery {
    protected Double price;
    protected String name;

    public String getMessage() {
        return "Drink maker will make";
    }

    public Boolean verifyPrice(Double moneyInserted) {
        return moneyInserted >= price;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
