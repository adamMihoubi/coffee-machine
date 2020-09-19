package domain.delivery;

public class Message implements Delivery {
    private String message;

    public Message() {
        message = "Drink maker forwards any message received onto the coffee machine interface for the customer to see";
    }

    public Message(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
