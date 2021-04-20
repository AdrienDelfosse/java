package be.technifutur.starwars;

public class Millenium extends AbstractVaisseau{


    public Millenium() {
        super("Millenium");
    }

    public void vitesseLumiere(){
        System.out.println("Passage à la vitesse lumière");

    }

    @Override
    public void decoler() {
        super.decoler();
        vitesseLumiere();
    }

    @Override
    public void afficheCamps(){
        System.out.println("Je suis un rebelle");
    }

}
