package com.example.demo;

public class ExceptionByZero extends IllegalArgumentException{
    public ExceptionByZero() {
    }

    public ExceptionByZero(String s) {
        super(s);
    }

    public ExceptionByZero(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionByZero(Throwable cause) {
        super(cause);
    }
}
