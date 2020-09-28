package domain.delivery;


public enum Sugar {
    FREE("::"),
    ONE(":1:0"),
    TWO(":2:0");

    Sugar(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
