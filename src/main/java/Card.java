package org.example;

public class Card {
    private String suit; // The suit of the card (♥, ♦, ♣, ♠)
    private String symbol; // The symbol of the card (2, 3, ..., J, Q, K, A)
    private int value; // The numerical value of the card (2-14)

    public Card(String suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return symbol + suit + " (Value: " + value + ")";
    }
}
