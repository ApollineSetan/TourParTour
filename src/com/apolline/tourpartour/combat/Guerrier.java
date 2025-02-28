package com.apolline.tourpartour.combat;

import java.util.Random;

public class Guerrier extends Personnage{
    // Attributs
    private int bonusDefense;

    // Constructeurs
    public Guerrier(){}

    public Guerrier(String nom, int vie, int attaque, int defense, int bonusDefense){
        super(nom, vie, attaque, defense);
        this.bonusDefense = bonusDefense;
    }

    // Getters et Setters
    public int getBonusDefense() {
        return bonusDefense;
    }

    public void setBonusDefense(int bonusDefense) {
        this.bonusDefense = bonusDefense;
    }

    // Méthode d'attaque personnalisée
    public void attaquer(Personnage cible){
        Random rand = new Random();
        // Ajouter une chance de coup critique (bonusDefense) avec 5 % de chance (5 fois sur 100)
        boolean coupCritique = rand.nextInt(100) < 5;

        // Si le coup critique est réussi, il s'ajoute aux points de vie
        if (coupCritique){
            this.setVie(this.getVie() + bonusDefense);
            System.out.println("Coup défensif ! " + this.getNom() + " gagne " + bonusDefense + " points de vie supplémentaires!");
        }

        int degats = this.getAttaque() - cible.getDefense();

        if (degats > 0){
            cible.setVie(cible.getVie() - degats);
        }

        System.out.print(this.getNom() + " attaque " + cible.getNom() + " et lui inflige " + degats + " points de dégâts.");
    }
}