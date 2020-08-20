package com.company;

import com.company.ErrorLevels;

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
