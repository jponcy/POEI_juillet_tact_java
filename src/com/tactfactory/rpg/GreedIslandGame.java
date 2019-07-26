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
    private PlayableCharacter currentPlayer; // = null (par defaut);


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
        String[] action;

        do {
            this.printActionPossibilities();
            action = this.scanner.nextLine().split(" ");

            if (action.length == 0) {
                System.out.println("Aucune commande saisie.");
            } else {
                switch (action[0].toLowerCase()) {
                case "deco": // Deconnexion.
                    this.disconnect();
                    break;
                case "m": // Mouvement.
                    this.move(action);
                    break;
                case "attaquer": // Attaquer dans le vide.
                    this.attack();
                    break;
                case "repo": // Se reposer.
                    this.rest();
                    break;
                default:
                    System.err.println(String.format("La commande %s est inconnue", action[0]));
                }
            }
        } while (this.isLogged());
    }

    public boolean isLogged() {
        return this.currentPlayer != null;
    }

    private void disconnect() {
        this.currentPlayer = null;
        System.out.println("Vous vous déconnecter");
    }

    private void attack() {
        if (this.currentPlayer.hasEnoughPaToAttack()) {
            this.currentPlayer.attack();
            System.out.println("Vous avez vaillament attaquer rien du tout, attaque réussi, CC, ...");
        } else {
            System.err.println("Pas assez de PA ppour attaquer");
        }
    }

    private void rest() {
        this.currentPlayer.rest();
        System.out.println("Vous dormer à points fermé");
    }

    private void move(String[] action) {
        if (action.length >= 2) {
            int caseNb = Integer.parseInt(action[1]);
            // Il faudrait verifier que le deuxieme parametre est bien un entier (ideallement avec une regex).
            this.move(caseNb);
        } else {
            System.err.println("Il faut préciser de combien de cases vous voulez vous déplacer");
        }
    }

    private void move(int caseNb) {
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

    private void printActionPossibilities() {
        final StringBuilder builder = new StringBuilder();

        builder.append("Que voulez vous faire maintenant ?");
        builder.append(' ');
        builder.append('(');
        builder.append("M <nb-cases> => pour sé déplacer du nombre de cases données");
        builder.append(" ; ");
        builder.append("Deco => pour vous déconnecter du jeu");
        builder.append(" ; ");
        builder.append("Repo = > pour vous reposer");
        builder.append(" ; ");
        builder.append("Attaquer => pour attaquer");
        builder.append(')');
        builder.append('\n');

        System.out.println(builder);
    }
}
