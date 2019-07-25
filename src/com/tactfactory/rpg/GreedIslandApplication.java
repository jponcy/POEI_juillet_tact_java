package com.tactfactory.rpg;

import java.util.Scanner;

public class GreedIslandApplication {
    public static void main(String[] args) {
        System.out.println("Quel est le nom de votre personnage ?");

        final Scanner scanner = new Scanner(System.in);
        final String pseudo = scanner.nextLine();

        System.out.println(String.format("Bienvenue %s", pseudo));
    }
}
