package com.company.httpCodes;

public enum ErrorLevels implements Comparable<ErrorLevels> {
    HIGH(2),
    MEDIUM(1),
    LOW(0);

    private final int value;

    public int getValue() {
        return value;
    }

    ErrorLevels(int value) {
        this.value = value;
    }
}
