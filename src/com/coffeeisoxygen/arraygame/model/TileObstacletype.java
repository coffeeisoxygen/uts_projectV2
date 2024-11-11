package com.coffeeisoxygen.arraygame.model;

public class TileObstacletype extends TileModel {
    public TileObstacletype(int row, int col) {
        super(row, col);
    }

    @Override
    public void interact(PlayerModel player) {
        // for development we just print to terminal
        System.out
                .println("ObstacleTile (" + getRow() + "," + getCol() + ") just passed by player: " + player.getName());
        // actual interact to player is make the player state gameover
        player.getGameState().setPlayerState(PlayerState.LOSE);
    }
}