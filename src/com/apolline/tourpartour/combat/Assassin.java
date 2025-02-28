package com.apolline.tourpartour.combat;

import java.util.Random;

public class Assassin extends Personnage {
    // Attributs
    private int bonusAttaque;

    // Constructeurs
    public Assassin(){}

    public Assassin(String nom, int vie, int attaque, int defense, int bonusAttaque){
        super(nom, vie, attaque, defense);
        this.bonusAttaque = bonusAttaque;
    }

    // Getters et Setters
    public int getBonusAttaque() {
        return bonusAttaque;
    }

    public void setBonusAttaque(int bonusAttaque) {
        this.bonusAttaque = bonusAttaque;
    }

    // Méthode d'attaque personnalisée
    public void attaquer(Personnage cible){
        Random rand = new Random();

        // Ajouter une chance de coup critique (attaque + bonusAttaque) avec 5 % de chance (5 fois sur 100)
        boolean coupCritique = rand.nextInt(100) < 5;

        // Les dégâts valent l'attaque courante moins la défense de la cible
        int degats = this.getAttaque() - cible.getDefense();

        // Si le coup critique est réussi, il s'ajoute aux dégats de base
        if (coupCritique){
            degats += bonusAttaque;
            System.out.println("Coup critique ! Attaque renforcée de " + bonusAttaque + " points!");
        }

        if (degats > 0){
            cible.setVie(cible.getVie() - degats);
        }

        System.out.println(this.getNom() + " attaque " + cible.getNom() + " et lui inflige " + degats + " points de dégâts.");
    }
}