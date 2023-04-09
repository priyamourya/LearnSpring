package com.example.phaseOne;

import com.example.phaseOne.game.GameRunner;
import com.example.phaseOne.game.Mario;

public class Game {
    public static void main(String args[]){
        Mario marioObj=new Mario();
        GameRunner gameRunnerObj= new GameRunner(marioObj);
        gameRunnerObj.run();
    }
}
