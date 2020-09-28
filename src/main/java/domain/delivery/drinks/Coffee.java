package domain.delivery.drinks;

import domain.delivery.Sugar;

public class Coffee extends Drink {

    public Coffee(Sugar sugar, Boolean extraHot) {
        super(sugar, extraHot);
        super.code = "C";
    }
}
