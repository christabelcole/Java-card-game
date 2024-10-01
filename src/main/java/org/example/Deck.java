package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deckOfCards;

    public Deck() {
        this.deckOfCards = new ArrayList<>();
        createDeck(); // Create the deck when the object is instantiated
    }

    private void createDeck() {
        String[] suits = {"♥", "♦", "♣", "♠"};
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int value;

        for (String suit : suits) {
            value = 2;
            for (String symbol : symbols) {
                deckOfCards.add(new Card(suit, symbol, value));
                value++;
            }
        }

}
