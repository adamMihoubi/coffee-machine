package domain.delivery.drinks;

import domain.delivery.Delivery;
import domain.delivery.Sugar;

public abstract class Drink implements Delivery {

    protected Sugar sugar;
    protected String code;

    public Drink(Sugar sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return code.concat(sugar.getValue());
    }
}
