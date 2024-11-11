package com.coffeeisoxygen.arraygame.model;

public class TileEndtype extends TileModel {
    public TileEndtype(int row, int col) {
        super(row, col);
    }

    @Override
    public void interact(PlayerModel player) {
        // for development we just print to terminal
        System.out.println("EndTile (" + getRow() + "," + getCol() + ") just passed by player: " + player.getName());
        // actual interact to player is make the player state win the game
        player.getGameState().setPlayerState(PlayerState.WIN);
        // calculate the score
        // the score is using the efficiency of the player to reach then end tile
        // energy input /steps used * 100%

    }

}
