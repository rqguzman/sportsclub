package com.rqguzman.sportsclub.services.exceptions;

public class MyDatabaseIntegrityException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public MyDatabaseIntegrityException(String msg) {
        super(msg);
    }

}
