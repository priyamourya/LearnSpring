package com.example.phaseOne.game;

public class GameRunner {
    Mario marioGame;
    public GameRunner(Mario marioGameObj){
        this.marioGame=marioGameObj;
    }
    public void run() {
        marioGame.left();
        marioGame.down();
        marioGame.up();
        marioGame.right();
    }
}
