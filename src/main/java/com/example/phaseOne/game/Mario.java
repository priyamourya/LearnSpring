package com.example.phaseOne.game;

import com.example.phaseOne.GamingConsole;

public class Mario implements GamingConsole {
    public void left() {
        System.out.println("left");
    }
    public void right() {
        System.out.println("right");
    }
    public void down() {
        System.out.println("down");
    }
    public void up() {
        System.out.println("up");
    }
}
