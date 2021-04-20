package be.technifutur.starwars;

public abstract class Rebelle extends Personnage {


    public Rebelle(String name) {
        super(name);
    }

    @Override
    public void afficheCamps() {
        System.out.println("Rebelle");
    }
}
