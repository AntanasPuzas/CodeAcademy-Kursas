package com.company;

public class HttpCode {
    private ErrorLevels errorLevels;

    public HttpCode(ErrorLevels errorLevels) {
        this.errorLevels = errorLevels;
    }

    public ErrorLevels getErrorLevels() {
        return errorLevels;
    }

    public void setErrorLevels(ErrorLevels errorLevels) {
        this.errorLevels = errorLevels;
    }

    @Override
    public String toString() {
        return "HttpCode{" +
                "errorLevels=" + errorLevels +
                '}';
    }
}
