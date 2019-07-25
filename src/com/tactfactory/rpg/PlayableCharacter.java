package com.tactfactory.rpg;

public class PlayableCharacter {
    /** The name of character. */
    private String name;

    /** The points of action. */
    private int pa;

    /** The points of move. */
    private int pm;

    /** The health points. */
    private int hp;

    /** Construct to use to fill all attributes. */
    public PlayableCharacter(final String name, final int pa, final int pm, final int hp) {
        this.name = name;
        this.pa = pa;
        this.pm = pm;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return String.format("%s [pa: %d, pm: %d, pv: %d]", this.getName(), this.pa, this.pm, this.hp);
    }

// Fonctionne pour tester si une chaine est égale à un personnage, mais c'est une solution border
//    @Override
//    public boolean equals(Object obj) {
//        return obj instanceof String ? obj.equals(this.getName()) : super.equals(obj);
//    }

    public String getName() {
        return this.name;
    }
}