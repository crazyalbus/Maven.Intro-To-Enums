package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {

    String input;

    public AliceBobEvaluator(String input) {
        this.input = input;
    }

    public boolean isAlice() {
        return this.input.equals("Alice");
    }

    public boolean isBob() {
        return this.input.equals("Bob");
    }

}
