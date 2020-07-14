package com.company;

public class HttpCode {
    ErrorLevels errorLevels;

    public HttpCode(ErrorLevels errorLevels) {
        this.errorLevels = errorLevels;
    }

    @Override
    public String toString() {
        return "HttpCode{" +
                "errorLevels=" + errorLevels +
                '}';
    }
}
