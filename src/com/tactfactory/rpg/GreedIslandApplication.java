package com.tactfactory.rpg;

public class GreedIslandApplication {
    public static void main(String[] args) {
        final GreedIslandGame game = new GreedIslandGame();

//        if (game.login()) {
//            game.play();
//        }
        // Ou
        game.login();

        if (game.isLogged()) {
            game.play();
        }
    }
}
