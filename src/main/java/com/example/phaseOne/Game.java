package com.example.phaseOne;

import com.example.phaseOne.game.GameRunner;
import com.example.phaseOne.game.Mario;
import com.example.phaseOne.game.PacmanGame;
import com.example.phaseOne.game.SuperContra;

public class Game {
    public static void main(String args[]){
        Mario marioObj=new Mario();
        SuperContra superContraObj=new SuperContra();
        PacmanGame pacmanGameObj=new PacmanGame();
        GameRunner gameRunnerObj= new GameRunner(pacmanGameObj);
        gameRunnerObj.run();
    }
}
