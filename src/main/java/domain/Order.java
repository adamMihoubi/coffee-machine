package domain;

public class Order {
    private final String firstPart;
    private String secondPart;
    private Boolean hasSecondPart = true;

    public Order(String order) {
        firstPart = order.split(":")[0];
        try {
            secondPart = order.split(":")[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            hasSecondPart = false;
        }
    }

    public String getFirstPart() {
        return firstPart;
    }

    public Boolean getHasSecondPart() {
        return hasSecondPart;
    }

    public String getSecondPart() {
        return secondPart;
    }

}
