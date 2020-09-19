package domain.delivery.drinks;

public class Tea extends Drink {

    public String getMessage() {
        return String.join(" "
                , super.getMessage()
                , "tea");
    }
}
