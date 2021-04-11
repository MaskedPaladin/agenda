package com.company;
public class Main {
    public static GameFuncs game = new GameFuncs();

    public Main() {
    }
    public static void main(String[] args) {
        game.initialize();
        game.pedir();
    }
}
