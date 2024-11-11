package com.coffeeisoxygen.arraygame.model;

public abstract class TileModel {
    protected final int row;
    protected final int col;

    public TileModel(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public abstract void interact(PlayerModel player);
}
