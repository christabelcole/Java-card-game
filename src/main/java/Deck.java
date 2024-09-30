package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deckOfCards;

    public Deck() {
        this.deckOfCards = new ArrayList<>();
        createDeck(); // Populate the deck when initialized
    }

    private void createDeck() {
        String[] suits = {"♥", "♦", "♣", "♠"};
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int value;

        for (String suit : suits) {
            value = 2; // Reset value for each suit
            for (String symbol : symbols) {
                deckOfCards.add(new Card(suit, symbol, value));
                value++;
            }
        }
    }

    public Card dealCard() {
        if (!deckOfCards.isEmpty()) {
            return deckOfCards.remove(0); // Deal from the top of the deck
        }
        return null; // No cards left
    }

    public void shuffle() {
        Collections.shuffle(deckOfCards); // Shuffle the deck
    }

    public ArrayList<Card> sortDeckInNumberOrder() {
        Collections.sort(deckOfCards, (card1, card2) -> {
            return Integer.compare(card1.getValue(), card2.getValue());
        });
        return deckOfCards; // Return sorted deck
    }

    public ArrayList<Card> sortDeckIntoSuits() {
        Collections.sort(deckOfCards, (card1, card2) -> {
            int suitCompare = card1.getSuit().compareTo(card2.getSuit());
            if (suitCompare != 0) {
                return suitCompare;
            } else {
                return Integer.compare(card1.getValue(), card2.getValue());
            }
        });
        return deckOfCards; // Return sorted deck
    }

    public ArrayList<Card> getCards() {
        return deckOfCards; // Return the list of cards
    }
}
