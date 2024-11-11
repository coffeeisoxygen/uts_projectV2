package com.coffeeisoxygen.arraygame.model;

public class PlayerModel {
    private final String name;
    private int energy;
    private Integer score;
    private GameState gameState;

    public PlayerModel(String name, int energy, Integer score, GameState gameState) {
        this.name = name;
        this.energy = energy;
        this.score = score;
        this.gameState = gameState;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public Integer getScore() {
        return score;
    }

    public GameState getGameState() {
        return gameState;
    }
}