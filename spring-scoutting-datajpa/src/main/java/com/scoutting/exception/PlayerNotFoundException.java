package com.scoutting.exception;

public class PlayerNotFoundException extends RuntimeException {
    public PlayerNotFoundException() {
    }

    public PlayerNotFoundException(String message) {
        super(message);
    }
}
