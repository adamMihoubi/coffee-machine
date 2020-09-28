package domain.delivery.drinks;

import domain.delivery.Sugar;

public class OrangeJuice extends Drink {
    public OrangeJuice() {
        super(Sugar.FREE, false);
        code = "O";
    }
}
