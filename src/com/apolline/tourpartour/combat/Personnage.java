package com.apolline.tourpartour.combat;

public class Personnage {
    // Attributs
    private String nom;
    private int vie;
    private int attaque;
    private int defense;

    // Constructeurs
    public Personnage(){}

    public Personnage(String nom, int vie, int attaque, int defense){
        this.nom = nom;
        this.vie = vie;
        this.attaque = attaque;
        this.defense = defense;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    // Méthode d'attaque
    public void attaquer(Personnage cible) {

        // Les dégâts valent l'attaque courante moins la défense de la cible
        int degats = this.attaque - cible.getDefense();

        if (degats > 0){
            cible.setVie(cible.getVie() - degats);
        }

        System.out.println(this.nom + " attaque " + cible.getNom() + " et lui inflige " + degats + " points de dégâts.");
    }
}