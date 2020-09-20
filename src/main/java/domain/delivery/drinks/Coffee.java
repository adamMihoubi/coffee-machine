package domain.delivery.drinks;

public class Coffee extends Drink {

    public Coffee() {
        super.price = 0.6;
        super.name = "coffee";
    }

    public String getMessage() {
        return String.join(" ",
                super.getMessage(),
                "one"
                , name);
    }
}
