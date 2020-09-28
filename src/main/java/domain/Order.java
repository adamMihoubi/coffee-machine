package domain;

public enum Order {
    CHOCOLATE(0.5),
    COFFEE(0.6),
    TEA(0.4);

    private Double price;

    Order(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }
}
