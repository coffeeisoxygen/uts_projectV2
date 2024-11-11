package com.coffeeisoxygen.arraygame.model;

public class GameState {
    private PlayerState playerState;

    public GameState(PlayerState playerState) {
        this.playerState = playerState;
    }

    public PlayerState getPlayerState() {
        return playerState;
    }

    public void setPlayerState(PlayerState playerState) {
        this.playerState = playerState;
    }
}