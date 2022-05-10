package com.player.model;

public enum Batting {
    RIGHTHANDBAT("Right Hand Bat"),
    LEFTHANDBAT("Left Hand Bat");

    public String type;

    Batting(String type) {
        this.type = type;
    }
}
