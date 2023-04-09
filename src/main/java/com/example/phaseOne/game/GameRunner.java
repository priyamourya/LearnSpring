package com.example.phaseOne.game;

import com.example.phaseOne.GamingConsole;

public class GameRunner {
    Mario marioGame;
    private GamingConsole gamingConsole;
    public GameRunner(GamingConsole gamingConsole){
        this.gamingConsole=gamingConsole;
    }
    public void run() {
        gamingConsole.left();
        gamingConsole.down();
        gamingConsole.up();
        gamingConsole.right();
    }
}
