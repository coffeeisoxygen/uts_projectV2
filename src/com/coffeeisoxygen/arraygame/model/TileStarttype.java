package com.coffeeisoxygen.arraygame.model;

public class TileStarttype extends TileModel {
    public TileStarttype(int row, int col) {
        super(row, col);
    }

    @Override
    public void interact(PlayerModel player) {
        // for development we just print to terminal
        System.out.println("StartTile (" + getRow() + "," + getCol() + ") just passed by player: " + player.getName());
    }

}
