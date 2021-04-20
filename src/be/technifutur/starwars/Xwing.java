package be.technifutur.starwars;

public class Xwing extends AbstractVaisseau {

    public Xwing() {
        super("Xwing");
    }

    @Override
    public void afficheCamps() {
        System.out.println("Je suis fidèle à l'empire");
    }

}