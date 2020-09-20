package domain.delivery.drinks;

public class Tea extends Drink {

    public Tea() {
        super.price = 0.4;
        super.name = "tea";
    }

    public String getMessage() {
        return String.join(" "
                , super.getMessage()
                , "one"
                , name);
    }
}
