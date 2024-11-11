package com.coffeeisoxygen.arraygame.model;

public class SafeTile extends TileModel {
    public SafeTile(int row, int col) {
        super(row, col);
    }

    @Override
    public void interact(PlayerModel player) {
        // Do nothing
        // for development we just print to terminal
        System.out.println("SafeTile (" + getRow() + "," + getCol() + ") just passed by player: " + player.getName());
    }

}
