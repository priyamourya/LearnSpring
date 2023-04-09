package com.example.phaseOne.game;

public class GameRunner {
    Mario marioGame;
    private SuperContra SuperContra;
    public GameRunner(SuperContra SuperContra){
        this.SuperContra=SuperContra;
    }
    public void run() {
        SuperContra.left();
        SuperContra.down();
        SuperContra.up();
        SuperContra.right();
    }
}
