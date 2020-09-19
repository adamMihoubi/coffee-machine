package domain.delivery.drinks;

public class Chocolate extends Drink {

    public String getMessage() {
        return String.join(" "
                , super.getMessage()
                , "chocolate");
    }
}
