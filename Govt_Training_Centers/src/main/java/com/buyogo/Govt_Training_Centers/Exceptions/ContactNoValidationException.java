package com.buyogo.Govt_Training_Centers.Exceptions;

public class ContactNoValidationException extends RuntimeException{
    public ContactNoValidationException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "java.lang.ContactNoValidationException";
    }
}
