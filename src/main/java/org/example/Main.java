package org.example;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Snap class with two players
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        Snap snapGame =
                new Snap("Snap Game", player1, player2);

        // Start the Snap game
        snapGame.startGame(); // Start the game
    }
}

