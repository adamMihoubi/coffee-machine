package domain.delivery.drinks;

public class Coffee extends Drink {

    public String getMessage() {
        return String.join(" ",
                super.getMessage(),
                "coffee");
    }
}
