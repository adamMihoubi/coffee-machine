package domain.delivery.drinks;

import domain.delivery.Sugar;

public class Chocolate extends Drink {

    public Chocolate(Sugar sugar, Boolean extraHot) {
        super(sugar, extraHot);
        code = "H";
    }
}
