package com.scoutting.model;

public enum Hander {
    LEFT("Left Hander"),
    RIGHT("Right Hander");

    public String type;

    Hander(String value) {
        this.type = value;

    }
}