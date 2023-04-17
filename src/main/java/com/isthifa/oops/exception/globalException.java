package com.isthifa.oops.exception;

public class globalException {
    private String message;
    public globalException()
    {

    }


    public globalException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
