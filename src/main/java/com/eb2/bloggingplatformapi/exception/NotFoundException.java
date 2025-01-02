package com.eb2.bloggingplatformapi.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends RuntimeException {

    private final String code;
    private final HttpStatus status;


    public NotFoundException(String message, String code, HttpStatus status) {
        super(message);
        this.code = code;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
