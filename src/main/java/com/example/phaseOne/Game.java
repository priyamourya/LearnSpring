package com.example.phaseOne;

import com.example.phaseOne.game.GameRunner;
import com.example.phaseOne.game.Mario;
import com.example.phaseOne.game.SuperContra;

public class Game {
    public static void main(String args[]){
        Mario marioObj=new Mario();
        SuperContra SuperContra=new SuperContra();
        GameRunner gameRunnerObj= new GameRunner(SuperContra);
        gameRunnerObj.run();
    }
}
