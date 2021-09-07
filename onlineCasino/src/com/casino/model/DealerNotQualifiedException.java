package com.casino.model;

public class DealerNotQualifiedException extends RuntimeException{
    public DealerNotQualifiedException(String message) {
        super(message);
    }
}
