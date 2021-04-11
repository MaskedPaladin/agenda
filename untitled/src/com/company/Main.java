package com.company;
import java.util.Scanner;
public class Main {
    public static GameFuncs game = new GameFuncs();
    public static void main(String[] args) {
        game.initialize();
        game.pedir();
    }
}