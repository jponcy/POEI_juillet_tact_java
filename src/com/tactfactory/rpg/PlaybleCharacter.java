package com.tactfactory.rpg;

public class PlaybleCharacter {
    /** The name of character. */
    private String name;

    /** The points of action. */
    private int pa;

    /** The points of move. */
    private int pm;

    /** The health points. */
    private int hp;

    /** Construct to use to fill all attributes. */
    public PlaybleCharacter(final String name, final int pa, final int pm, final int hp) {
        this.name = name;
        this.pa = pa;
        this.pm = pm;
        this.hp = hp;
    }
}
