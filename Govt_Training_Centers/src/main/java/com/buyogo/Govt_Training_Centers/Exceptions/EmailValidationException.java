package com.buyogo.Govt_Training_Centers.Exceptions;

public class EmailValidationException extends RuntimeException{
    public EmailValidationException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "java.lang.EmailValidationException";
    }
}
