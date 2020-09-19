package domain.exceptions;

public class BadOrderException extends RuntimeException {
    @Override
    public String getMessage() {
        return "the given order is bad";
    }
}
