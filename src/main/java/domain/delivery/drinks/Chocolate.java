package domain.delivery.drinks;

public class Chocolate extends Drink {

    public Chocolate() {
        super.price = 0.5;
    }

    public String getMessage() {
        return String.join(" "
                , super.getMessage()
                , "chocolate");
    }
}
