package com.crown.crown.interactive.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CustomerDoesNotException extends RuntimeException{

    public CustomerDoesNotException() {
        super();
    }
    public CustomerDoesNotException(String message, Throwable cause) {
        super(message, cause);
    }
    public CustomerDoesNotException(String message) {
        super(message);
    }
    public CustomerDoesNotException(Throwable cause) {
        super(cause);
    }

}
