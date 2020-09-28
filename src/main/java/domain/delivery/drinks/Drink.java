package domain.delivery.drinks;

import domain.delivery.Sugar;

public abstract class Drink {

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
