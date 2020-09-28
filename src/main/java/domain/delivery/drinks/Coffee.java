package domain.delivery.drinks;

import domain.delivery.Sugar;

public class Coffee extends Drink {

    public Coffee(Sugar sugar) {
        super(sugar);
        super.code = "C";
    }
}
