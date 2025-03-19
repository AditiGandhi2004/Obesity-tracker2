package edu.gatech.obesitytracker.web.error;

public class UserAlreadyExistsException extends RuntimeException {

    public UserAlreadyExistsException() {
    }

    public UserAlreadyExistsException(final String message) {
        super(message);
    }

    public UserAlreadyExistsException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public UserAlreadyExistsException(final Throwable cause) {
        super(cause);
    }
}
