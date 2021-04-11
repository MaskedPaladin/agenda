package com.company;

import java.util.Scanner;

public class GameFuncs {
    int maxmembers = 4;
    Member[] enemies;
    Member[] allied;

    public GameFuncs() {
        enemies = new Member[maxmembers];
        allied = new Member[maxmembers];
    }

    public void menu() {
        System.out.println("||||||||||");
        System.out.println("WAR SIM");
        System.out.println("**********");
        System.out.println("1. Jugar");
        System.out.println("2. Editar");
        System.out.println("3. Listar");
        System.out.println("4. Salir");
    }

    public void pedir() {
        Scanner sc = new Scanner(System.in);
        menu();
        int input = sc.nextInt();
        if (input == 1) {
            jugar();
            pedir();
        }

        if (input == 2) {
            editar();
            pedir();
        }

        if (input == 3) {
            listar();
            pedir();
        }

        if (input == 4) {
            System.exit(0);
        }

        if (input > 3 || input < 0) {
            System.out.println("Not valid value:");
            System.out.println("1. Jugar");
            System.out.println("2. Editar");
            System.out.println("3. Listar");
            System.out.println("4. Salir");
            pedir();
        }

    }

    void initialize() {
        for(int i = 0; i < maxmembers; ++i) {
            allied[i] = new Member();
            enemies[i] = new Member();
        }

    }

    public void jugar() {
    }

    public void editar() {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < maxmembers; ++i) {
            System.out.println("Slot: " + i);
            System.out.print("Nombre: ");
            String nombre = sc.next();
            System.out.print("Strength: ");
            int strength = sc.nextInt();
            System.out.print("Intellect: ");
            int intellect = sc.nextInt();
            System.out.print("Dexerty: ");
            int dexerty = sc.nextInt();
            System.out.print("Constitution: ");
            int constitution = sc.nextInt();
            System.out.print("Wispower: ");
            int wispower = sc.nextInt();
            allied[i].name = nombre;
            allied[i].str = strength;
            allied[i].intel = intellect;
            allied[i].dex = dexerty;
            allied[i].con = constitution;
            allied[i].wisp = wispower;
            allied[i].media = ((strength + intellect + dexerty + constitution + wispower) / 5);
            allied[i].hp = strength * constitution * 4;
            allied[i].mana = intellect * 2.3F;
            allied[i].stamina = (strength + constitution) / 1.6F;
        }

    }

    public void listar() {
        for(int i = 0; i < maxmembers; ++i) {
            String var10001 = allied[i].name;
            System.out.println("Name: " + var10001 + " HP: " + allied[i].hp + " MANA: " + allied[i].mana + " STAMINA: " + allied[i].stamina + " (STR: " + allied[i].str + " INT: " + allied[i].intel + " DEX: " + allied[i].dex + " CON: " + allied[i].con + " WIS: " + allied[i].wisp + " MEDIA: " + allied[i].media + ")");
        }

    }
}