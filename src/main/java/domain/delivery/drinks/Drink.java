package domain.delivery.drinks;

import domain.delivery.Delivery;
import domain.delivery.Sugar;

public abstract class Drink implements Delivery {

    protected Sugar sugar;
    protected String code;
    private final String extraHot;

    public Drink(Sugar sugar, Boolean extraHot) {
        this.sugar = sugar;
        this.extraHot = extraHot ? "h" : "";
    }

    @Override
    public String toString() {
        return code.concat(extraHot + sugar.getValue());
    }
}