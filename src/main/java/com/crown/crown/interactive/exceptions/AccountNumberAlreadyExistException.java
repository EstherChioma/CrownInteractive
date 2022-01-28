package com.crown.crown.interactive.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class AccountNumberAlreadyExistException extends RuntimeException{


    public AccountNumberAlreadyExistException() {
        super();
    }
    public AccountNumberAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }
    public AccountNumberAlreadyExistException(String message) {
        super(message);
    }
    public AccountNumberAlreadyExistException(Throwable cause) {
        super(cause);
    }

}




