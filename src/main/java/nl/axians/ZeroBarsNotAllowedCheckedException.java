package nl.axians;

public class ZeroBarsNotAllowedCheckedException extends Exception {
    ZeroBarsNotAllowedCheckedException(String message) {
        super(message);
    }

    ZeroBarsNotAllowedCheckedException(String message, Throwable cause) {
        super(message, cause);
    }
}
