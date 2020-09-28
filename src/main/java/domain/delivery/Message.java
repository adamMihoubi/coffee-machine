package domain.delivery;

public class Message implements Delivery {
    private final String code = "M";
    private String message;

    public Message(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return code.concat(":" + message);
    }
}
