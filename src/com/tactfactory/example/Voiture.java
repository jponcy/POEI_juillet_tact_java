package com.tactfactory.example;

public class Voiture {
    static final int NOMBRE_PORTE_PAR_DEFAUT = 4;

    private String nom; // = null par défaut
    private String marque;
    private String couleure;

    private int nombreDePortes = NOMBRE_PORTE_PAR_DEFAUT;
    private int nombreDeVitesses; // = 0 par défaut
    private boolean detruite; // = false par défaut

    public Voiture() {
        this("Voiture sans nom", "Binga");
    }

    public Voiture(String nom, String marque) {
        this.nom = nom;
        this.marque = marque;
    }

    public void changerCouleur(String nouvelleCouleure) {
        setCouleure(nouvelleCouleure);
    }

    public void afficherNbPortes() {
        System.out.println(this.obtenirNbPortes());
    }

    /* package */ int obtenirNbPortes() {
        return nombreDePortes;
    }

    public String getCouleure() {
        return couleure;
    }

    public void setCouleure(String couleure) {
        this.couleure = couleure;
    }
}
