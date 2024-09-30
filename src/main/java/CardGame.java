package org.example;

import java.util.ArrayList;

public class CardGame {
    protected Deck deck; // Change to Deck type
    private String name;

    public CardGame(String name) {
        this.name = name;
        this.deck = new Deck(); // Initialize the deck
    }

    public Card dealCard() {
        return deck.dealCard(); // Use Deck's dealCard method
    }

    public void shuffleDeck() {
        deck.shuffle(); // Call the shuffle method from Deck
    }

    public ArrayList<Card> sortDeckInNumberOrder() {
        return deck.sortDeckInNumberOrder(); // Call the sort method from Deck
    }

    public ArrayList<Card> sortDeckIntoSuits() {
        return deck.sortDeckIntoSuits(); // Call the sort method from Deck
    }

    public void getDeck() {
        for (Card card : deck.getCards()) {
            System.out.println(card); // Print cards in the deck
        }
    }
}
