package domain.delivery;

public class Message implements Delivery {

    @Override
    public String getMessage() {
        return "Drink maker forwards any message received onto the coffee machine interface for the customer to see";
    }
}
