package com.coffeeisoxygen.arraygame;

import com.coffeeisoxygen.arraygame.model.GameState;
import com.coffeeisoxygen.arraygame.model.PlayerModel;
import com.coffeeisoxygen.arraygame.model.PlayerState;

public class MainApp {
    public static void main(String[] args) {
        // Membuat objek PlayerModel dan GameState
        GameState gameState = new GameState(PlayerState.PLAYING);
        PlayerModel player = new PlayerModel("John", 100, null, gameState);

        // Menampilkan informasi pemain
        System.out.println("Player Name: " + player.getName());
        System.out.println("Player Energy: " + player.getEnergy());
        System.out.println("Player Score: " + player.getScore());
        System.out.println("Game State: " + player.getGameState().getPlayerState());

        // Mengubah state pemain menjadi WIN
        gameState.setPlayerState(PlayerState.WIN);
        System.out.println("Updated Game State: " + player.getGameState().getPlayerState());
    }
}