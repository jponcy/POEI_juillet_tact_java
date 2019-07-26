package com.tactfactory.rpg;

public class PlayableCharacter {
    private static final int DEFAULT_ATTACK_COST = 5;

    /** The name of character. */
    private String name;

    /** The maximal value of {@link #pa}. */
    private int paMax;
    /** The points of action. */
    private int pa;

    /** The maximal value of {@link #pm}. */
    private int pmMax;
    /** The points of move. */
    private int pm;

    /** The health points. */
    private int hp;

    /** Construct to use to fill all attributes. */
    public PlayableCharacter(final String name, final int paMax, final int pmMax, final int hp) {
        this.name = name;
        this.paMax = paMax;
        this.pmMax = pmMax;
        this.hp = hp;

        this.pa = this.paMax;
        this.pm = this.pmMax;
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

    /**
     *
     * @param caseNb
     * @return {@code TRUE} is move is success, {@code FALSE} otherwise.
     */
    public boolean move(int caseNb) {
        final boolean result;

        if (caseNb >= 0 && this.hasEnoughPM(caseNb)) {
            this.pm -= caseNb;
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    private boolean hasEnoughPM(final int caseNb) {
        return this.pm >= caseNb;
    }

    public int getPM() {
        return this.pm;
    }

    public boolean hasPM() {
        return this.getPM() > 0;
    }

    public boolean hasEnoughPaToAttack() {
        return this.pa >= PlayableCharacter.DEFAULT_ATTACK_COST;
    }

    public void attack() {
        this.pa -= PlayableCharacter.DEFAULT_ATTACK_COST;
    }

    public void rest() {
        if (this.pa < this.paMax) {
            ++ this.pa;
        }

        if (this.pm < this.pmMax) {
            ++ this.pm;
        }
    }
}
