package domain.delivery;


import domain.delivery.drinks.Drink;

public class Sugar extends Drink {
    private final Drink drink;
    private String sugarNumber;

    public Sugar(Drink drink, String sugarNumber) {
        this.drink = drink;
        this.sugarNumber = sugarNumber;
    }

    public String getMessage() {
        sugarNumber = (Integer.parseInt(sugarNumber) == 1) ? "one" : "two";
        return String.join(" "
                , drink.getMessage()
                , "with"
                , sugarNumber
                , "sugar"
                , "and a stick");
    }
}
