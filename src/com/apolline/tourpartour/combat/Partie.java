package com.apolline.tourpartour.combat;

public class Partie {
    // Attributs
    private Personnage joueur1;
    private Personnage joueur2;
    private int nbrTour;

    // Constructeurs
    public Partie(){}

    public Partie(Personnage joueur1, Personnage joueur2, int nbrTour){
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.nbrTour = nbrTour;
    }

    // Getters et Setters
    public Personnage getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(Personnage joueur1) {
        this.joueur1 = joueur1;
    }

    public Personnage getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(Personnage joueur2) {
        this.joueur2 = joueur2;
    }

    public int getNbrTour() {
        return nbrTour;
    }

    public void setNbrTour(int nbrTour) {
        this.nbrTour = nbrTour;
    }

    // Méthode LancerPartie
    public void lancerPartie() {

        // Tant que le nombre de tours est plus grand que 0, je répète ces actions
        while (nbrTour > 0){
            System.out.println("\n--- Tour " + (nbrTour) + " ---");

            //Joueur 1 attaque joueur 2
            joueur1.attaquer(joueur2);
            if (joueur2.getVie() <=0){
                System.out.println(joueur1.getNom() + " a gagné!");
                break;
            }

            //Joueur 2 attaque joueur 1
            joueur2.attaquer(joueur1);
            if (joueur1.getVie() <= 0){
                System.out.println(joueur2.getNom() + " a gagné!");
                break;
            }

            //Décrémenter le nombre de tours
            nbrTour--;
        }

        // Conditions pour déterminer une victoire ou une égalité
        if (joueur1.getVie() == joueur2.getVie()){
            System.out.println("Match nul!");
        } else if (joueur1.getVie() > 0){
            System.out.println("Le joueur " + joueur1.getNom() + " a gagné!");
        } else if (joueur2.getVie() > 0){
            System.out.println("Le joueur " + joueur2.getNom() + " a gagné!");
        }

    }

}
