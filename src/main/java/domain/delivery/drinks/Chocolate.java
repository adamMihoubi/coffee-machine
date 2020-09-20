package domain.delivery.drinks;

public class Chocolate extends Drink {

    public Chocolate() {
        super.price = 0.5;
        super.name = "chocolate";
    }

    public String getMessage() {
        return String.join(" "
                , super.getMessage()
                , "one"
                , name);
    }
}
