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
            int caseNb;

            do {
                System.out.println("De combien de cases voulez-vous vous déplacer ? (0 pour rester immobile)");
                caseNb = scanner.nextInt();

                if (caseNb < 0) {
                    System.err.println("Merci de saisir un nombre de case positif (ou nul)");
                } else if (caseNb == 0) {
                    System.out.println("Le personnage attends");
                } else if (player.move(caseNb)) {
                    System.out.println(String.format("%s s'est déplacé de %d cases, il lui reste %d PM",
                            player.getName(), caseNb, player.getPM()));
                } else {
                    System.out.println(String.format(
                            "Il ne vous reste que %d PM, un tel déplacement est donc impossible", player.getPM()));
                }
            } while (player.hasPM() && caseNb != 0);
        } else {
            System.err.println("Echec de la connexion");
        }

        scanner.close();
    }
}
