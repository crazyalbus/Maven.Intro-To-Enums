package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    ALICE,
    BOB;

    public String getCatchPhrase() {
        return "Hey, my name is " + this + "!";
    }

    public boolean isAlice() {
        return this == ALICE;
    }

    public boolean isBob() {
        return this == BOB;
    }
}
