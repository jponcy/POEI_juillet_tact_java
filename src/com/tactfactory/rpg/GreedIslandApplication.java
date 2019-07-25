package com.tactfactory.rpg;

import java.util.Scanner;

public class GreedIslandApplication {
    public static void main(String[] args) {
        System.out.println("Quel est le nom de votre personnage ?");

        final Scanner scanner = new Scanner(System.in);
        final String pseudo = scanner.nextLine();

        final PlayableCharacter player = new PlayableCharacter("Gon Freecss", 15, 100, 15000);

        System.out.println(player);

        if (pseudo.equals(player.getName())) {
            System.out.println("Connexion réussi");
            System.out.println(String.format("Bienvenue %s", pseudo));
        } else {
            System.err.println("Echec de la connexion");
        }

        scanner.close();
    }
}
