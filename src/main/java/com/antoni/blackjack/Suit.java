package com.antoni.blackjack;

public enum Suit {
    CLUBS('\u2663'),
    DIAMONDS('\u2666'),
    HEARTS('\u2665'),
    SPADES('\u2664');

    private final char symbol;

    Suit(char symbol) {
        this.symbol = symbol;
    }


    @Override
    public String toString() {
        return Character.toString(this.symbol);
    }
}
