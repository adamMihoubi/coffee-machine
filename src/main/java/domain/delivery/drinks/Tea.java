package domain.delivery.drinks;

import domain.delivery.Sugar;

public class Tea extends Drink {

    public Tea(Sugar sugar, Boolean extraHot) {
        super(sugar, extraHot);
        code = "T";
    }

}
