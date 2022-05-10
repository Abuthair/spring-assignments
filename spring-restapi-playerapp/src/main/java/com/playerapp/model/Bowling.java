package com.playerapp.model;

public enum Bowling {
    RIGHTHANDFASTBOWLER("Right Hand Fast Bowler"),
    LEFTHANDERFASTBOWLER("Left Hand Fast Bowler"),
    RIGHTHANDERMEDIUMBOWLER("Right Hand Medium Bowler"),
    LEFTHANDERMEDIUMBOWLER(("Left Hand Medium Bowler")),
    RIGHTHANDLEGSPIN("Right Hand Leg Spin"),
    RIGHTHANDOFFSPIN("Right Hand Off Spin"),
    LEFTHANDLEGSPIN("Left Hand Leg Spin"),
    LEFTHANDOFFSPIN("Left Hand Off Spin");

    public  String type;

    Bowling(String type) {
        this.type = type;
    }
}
