package com.company;

public class DeviceIsOffException extends Exception{
    private String exception;

    public DeviceIsOffException(String exception) {
        this.exception = exception;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }
}
