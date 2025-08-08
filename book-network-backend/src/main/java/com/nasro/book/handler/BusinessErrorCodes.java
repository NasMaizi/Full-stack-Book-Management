package com.nasro.book.handler;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;

public enum BusinessErrorCodes {
    NO_CODE(0, NOT_IMPLEMENTED, "No Code"),
    INCORRECT_CURRENT_PASSWORD(300, BAD_REQUEST, "Incorrect CURRENT Password"),
    NEW_PASSWORD_DOES_NOT_MATCH(301, BAD_REQUEST, "The new Password does not match"),
    ACCOUNT_LOCKED(302, FORBIDDEN, "Account Locked"),
    ACCOUNT_DISABLED(303, FORBIDDEN, "User Account Disabled"),
    BAD_CREDENTIALS(304, FORBIDDEN, "Login and / or password incorrect "),
    ;
    @Getter
    private final int code;
    @Getter
    private final String description;
    @Getter
    private final HttpStatus httpStatus;

    BusinessErrorCodes(int code, HttpStatus httpStatus, String description) {
        this.code = code;
        this.description = description;
        this.httpStatus = httpStatus;
    }
}
