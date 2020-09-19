package domain.delivery.drinks;

public class Tea extends Drink {

    public Tea() {
        super.price = 0.4;
    }

    public String getMessage() {
        return String.join(" "
                , super.getMessage()
                , "tea");
    }
}
