package com.playerapp.exception;

public class PlayerNotFoundException extends RuntimeException {
    public PlayerNotFoundException() {
    }

    public PlayerNotFoundException(String message) {
        super(message);
    }
}
