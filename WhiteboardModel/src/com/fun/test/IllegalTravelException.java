package com.fun.test;

//unchecked exception
public class IllegalTravelException extends RuntimeException{
    public IllegalTravelException() {
    }

    public IllegalTravelException(String message) {
        super(message);
    }

    public IllegalTravelException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalTravelException(Throwable cause) {
        super(cause);
    }
}
