package org.example;

public class CardGame {
    protected Deck deck;
    private String name;

    public CardGame(String name) {
        this.name = name;
        this.deck = new Deck(); // Initialize the deck when the game starts
    }

    public Card dealCard() {
        return deck.dealCard(); // Deal a card from the deck
    }

    public void shuffleDeck() {
        deck.shuffle(); // Shuffle the deck of cards
    }
}

