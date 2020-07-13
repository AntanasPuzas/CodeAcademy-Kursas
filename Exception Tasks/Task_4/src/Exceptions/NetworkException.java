package Exceptions;

public class NetworkException extends Exception {
    private String exception;

    public NetworkException(String exception) {
        this.exception = exception;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }
}
