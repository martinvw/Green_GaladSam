package nl.martinvw.test;

public class BusinessServiceException extends RuntimeException {
    public BusinessServiceException(String message, String toString) {
        super(message + toString);
    }
}
