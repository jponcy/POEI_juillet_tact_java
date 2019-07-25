package com.tactfactory.rpg;

import java.util.Scanner;

public class GreedIslandGame {

    /* Class attributes. */

    private static final PlayableCharacter[] players = new PlayableCharacter[] {
            new PlayableCharacter("Gon Freecss", 15, 100, 15000),
            new PlayableCharacter("Leorio", 3, 5, 15),
            new PlayableCharacter("Hisoka", 1500, 90, 150000),
            new PlayableCharacter("Kurapika", 9, 50, 1500)
    };


    /* Instance attributes. */

    private final Scanner scanner = new Scanner(System.in);
    private PlayableCharacter currentPlayer = null;


    /* Methods. */

    public boolean login() {
        System.out.println("Quel est le nom de votre personnage ?");

        final String pseudo = this.scanner.nextLine();

        // Try sign in.
        this.currentPlayer = this.searchPlayerByName(pseudo);

        if (this.isLogged()) {
            System.out.println("Connexion réussi");
            System.out.println(String.format("Bienvenue %s", pseudo));
        } else {
            System.err.println("Echec de la connexion");
        }

        return this.isLogged();
    }

    public void play() {
        int caseNb;

        do {
            System.out.println("De combien de cases voulez-vous vous déplacer ? (0 pour rester immobile)");
            caseNb = scanner.nextInt();

            if (caseNb < 0) {
                System.err.println("Merci de saisir un nombre de case positif (ou nul)");
            } else if (caseNb == 0) {
                System.out.println("Le personnage attends");
            } else if (this.currentPlayer.move(caseNb)) {
                System.out.println(String.format("%s s'est déplacé de %d cases, il lui reste %d PM",
                        this.currentPlayer.getName(), caseNb, this.currentPlayer.getPM()));
            } else {
                System.out.println(String.format("Il ne vous reste que %d PM, un tel déplacement est donc impossible",
                        this.currentPlayer.getPM()));
            }
        } while (this.currentPlayer.hasPM() && caseNb != 0);
    }

    public boolean isLogged() {
        return this.currentPlayer != null;
    }

    private PlayableCharacter searchPlayerByName(String pseudo) {
        PlayableCharacter result = null;
        int i = 0;

        do {
            if (pseudo.equals(GreedIslandGame.players[i].getName())) {
                result = GreedIslandGame.players[i];
            }
        } while (result == null && ++ i < GreedIslandGame.players.length);

        return result;
    }
}
