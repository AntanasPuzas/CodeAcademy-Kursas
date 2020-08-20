package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

enum HttpCodeEnum {
    CODE_404,
    CODE_401,
    CODE_500,
    CODE_403
}

enum ErrorLevels implements Comparable<ErrorLevels>{
    HIGH(2),
    MEDIUM(1),
    LOW(0);

    private int value;

    int getValue() { return value; }

    ErrorLevels(int value) { this.value = value; }
}

public class Main {
    public static void main(String[] args) {
        List<HttpErrorPair<HttpCodeEnum, HttpCode>> httpErrorPairList =
                new ArrayList<HttpErrorPair<HttpCodeEnum, HttpCode>>() {
            {
                add(new HttpErrorPair<>(HttpCodeEnum.CODE_500,
                        new InternalServerErrorHttpCode(ErrorLevels.HIGH)));
                add(new HttpErrorPair<>(HttpCodeEnum.CODE_401,
                        new BadRequestHttpCode(ErrorLevels.MEDIUM)));
                add(new HttpErrorPair<>(HttpCodeEnum.CODE_404,
                        new NotFoundHttpCode(ErrorLevels.LOW)));
                add(new HttpErrorPair<>(HttpCodeEnum.CODE_403,
                        new ForbiddenHttpCode(ErrorLevels.MEDIUM)));
            }
        };

        printList(httpErrorPairList);
        Collections.sort(httpErrorPairList);
        printList(httpErrorPairList);
    }

    public static <T> void printList(List<T> list) {
        for (T value : list) {
            System.out.println(value);
        }
        System.out.println();
    }
}