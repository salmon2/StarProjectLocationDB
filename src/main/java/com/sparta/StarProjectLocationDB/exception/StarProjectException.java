package com.sparta.StarProjectLocationDB.exception;

import lombok.Getter;

@Getter
public class StarProjectException extends Exception {

    private final ErrorCode errorCode;

    public StarProjectException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
