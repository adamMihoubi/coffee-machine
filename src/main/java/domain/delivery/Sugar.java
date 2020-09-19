package domain.delivery;


import domain.delivery.drinks.Drink;

public class Sugar extends Drink {
    private Drink drink;
    private String sugarNumber;

    public Sugar(Drink drink, String sugarNumber) {
        this.drink = drink;
        this.sugarNumber = sugarNumber;
    }

    public String getMessage() {
        String s = (Integer.parseInt(sugarNumber) > 1) ? "s" : "";
        return String.join(" "
                , drink.getMessage()
                , "with"
                , sugarNumber
                , "sugar" + s
                , "and a stick");
    }
}
