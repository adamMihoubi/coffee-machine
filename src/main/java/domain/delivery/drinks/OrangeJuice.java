package domain.delivery.drinks;

public class OrangeJuice extends Drink {

    public OrangeJuice() {
        super.price = 0.6;
    }

    public String getMessage() {
        return String.join(" "
                , super.getMessage()
                , "one orange juice");
    }
}
