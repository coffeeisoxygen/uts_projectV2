package com.coffeeisoxygen.arraygame.model;

public class TileCheckpointtype extends TileModel {
    public TileCheckpointtype(int row, int col) {
        super(row, col);
    }

    @Override
    public void interact(PlayerModel player) {
        // for development we just print to terminal
        System.out.println(
                "CheckpointTile (" + getRow() + "," + getCol() + ") just passed by player: " + player.getName());
        // actual interract is check the movement , if the player is chose to stay add
        // energy 10
        // if not rest then just print "you are not resting you missing 10 point energy"

    }

}
