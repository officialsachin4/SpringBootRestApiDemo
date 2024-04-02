package com.springboot.Spring.Boot.Project.Error;

public class DeartmentNotFoundException extends Exception{
    public DeartmentNotFoundException() {
        super();
    }

    public DeartmentNotFoundException(String message) {
        super(message);
    }

    public DeartmentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeartmentNotFoundException(Throwable cause) {
        super(cause);
    }

    protected DeartmentNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
