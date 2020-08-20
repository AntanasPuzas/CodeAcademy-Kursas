package com.company.httpCodes;

public class HttpCode {
    ErrorLevels errorLevels;

    public HttpCode(ErrorLevels errorLevels) {
        this.errorLevels = errorLevels;
    }

    public ErrorLevels getErrorLevels() {
        return errorLevels;
    }

    @Override
    public String toString() {
        return "HttpCode{" +
                "errorLevels=" + errorLevels +
                '}';
    }
}
