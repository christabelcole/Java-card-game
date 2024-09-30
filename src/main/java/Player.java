// Player.java
package org.example;

public class Player {
    private String name;
    private boolean isTurn;

    public Player(String name) {
        this.name = name;
        this.isTurn = false;
    }

    public String getName() {
        return name;
    }

    public boolean isTurn() {
        return isTurn;
    }

    public void setTurn(boolean isTurn) {
        this.isTurn = isTurn;
    }
}
