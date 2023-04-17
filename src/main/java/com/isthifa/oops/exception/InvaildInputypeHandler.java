package com.isthifa.oops.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class InvaildInputypeHandler {
    @ExceptionHandler
    public ResponseEntity<globalException> handleException(InvalidInputype invalidInput)
    {
        globalException error= new globalException();
        error.setMessage(invalidInput.getMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
