package org.example;

import java.util.Scanner;

public class Snap extends CardGame {
    private Scanner scanner;
    private Player player1;
    private Player player2;

    public Snap(String name, Player player1, Player player2) {
        super(name);
        this.scanner = new Scanner(System.in);
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        System.out.println("Starting the Snap game...");
        shuffleDeck();

        Card previousCard = null;
        Player currentPlayer = player1;

        while (true) {
            System.out.println(currentPlayer.getName() + "'s turn. Press Enter to deal a card...");
            scanner.nextLine(); // Wait for the player to press Enter

            Card currentCard = dealCard(); // Deal a card from the deck
            System.out.println("Current card: " + currentCard);

            if (previousCard != null && currentCard.getSymbol().equals(previousCard.getSymbol())) {
                System.out.println("SNAP! You have 2 seconds to type 'snap' to win!");

                if (checkForSnap()) {
                    System.out.println(currentPlayer.getName() + " won!");
                    break;
                } else {
                    System.out.println("Too slow! Game over.");
                    break;
                }
            }

            currentPlayer = (currentPlayer == player1) ? player2 : player1; // Switch turn
            previousCard = currentCard;
        }
        scanner.close();
    }

    private boolean checkForSnap() {
        long startTime = System.currentTimeMillis();
        String userInput = scanner.nextLine();

        long endTime = System.currentTimeMillis();
        return userInput.equalsIgnoreCase("snap") && (endTime - startTime) <= 2000;
    }
}
