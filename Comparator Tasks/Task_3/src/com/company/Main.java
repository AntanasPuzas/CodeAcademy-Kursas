package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Collections;

enum HttpCodeEnum {
    CODE_404,
    CODE_401,
    CODE_500,
    CODE_403
}

enum ErrorLevels {
    HIGH (2),
    MEDIUM (1),
    LOW (0);

    int severity;

    ErrorLevels(int severity) {
        this.severity = severity;
    }
}

public class Main {

    public static void main(String[] args) {
        ArrayList<HttpErrorPair> pairList = new ArrayList<>();
        pairList.add(new HttpErrorPair(HttpCodeEnum.CODE_500,
                new InternalServerErrorHttpCode(ErrorLevels.HIGH)));
        pairList.add(new HttpErrorPair(HttpCodeEnum.CODE_401,
                new BadRequestHttpCode(ErrorLevels.MEDIUM)));
        pairList.add(new HttpErrorPair(HttpCodeEnum.CODE_404,
                new NotFoundHttpCode(ErrorLevels.LOW)));
        pairList.add(new HttpErrorPair(HttpCodeEnum.CODE_403,
                new ForbiddenHttpCode(ErrorLevels.MEDIUM)));

        System.out.println(pairList);
        Collections.sort(pairList);
        System.out.println(pairList);
    }
}
