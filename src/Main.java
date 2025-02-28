import com.apolline.tourpartour.combat.Assassin;
import com.apolline.tourpartour.combat.Guerrier;
import com.apolline.tourpartour.combat.Partie;

public class Main {
    public static void main(String[] args){
        // Création des personnages
        Assassin assassin = new Assassin("Ezio", 50,10,5,3);
        Guerrier guerrier = new Guerrier("Harald", 60, 8, 7, 4);

        // Création de la partie
        Partie partieTest = new Partie(assassin, guerrier, 10);

        // On lance la partie
        partieTest.lancerPartie();
    }
}
