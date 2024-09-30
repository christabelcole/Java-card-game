package org.example;

import java.util.Scanner;

public class Snap extends org.example.CardGame {
    private Scanner scanner;

    public Snap(String name) {
        super(name);
        this.scanner = new Scanner(System.in);
    }

    public void startGame() {
        System.out.println("Starting the Snap game...");
        shuffleDeck(); // Shuffle the deck before starting

        org.example.Card previousCard = null;
        while (true) {
            org.example.Card currentCard = dealCard(); // Deal a card
            System.out.println("Current card: " + currentCard);

            // Check for a snap opportunity
            if (previousCard != null && currentCard.getSymbol().equals(previousCard.getSymbol())) {
                System.out.println("SNAP! You have 2 seconds to type 'snap' to win!");
                if (checkForSnap()) {
                    System.out.println("You won!");
                    break; // End the game
                } else {
                    System.out.println("You lost! No snap in time.");
                    break; // End the game
                }
            }
            previousCard = currentCard; // Set the previous card
        }
        scanner.close(); // Close the scanner
    }

    private boolean checkForSnap() {
        long startTime = System.currentTimeMillis();
        String userInput = scanner.nextLine(); // Wait for user input

        long endTime = System.currentTimeMillis();
        return userInput.equalsIgnoreCase("snap") && (endTime - startTime) <= 2000; // Check if input was 'snap' within 2 seconds
    }
}
