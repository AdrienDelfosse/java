package be.technifutur.starwars;

public abstract  class Empire extends  Personnage {


    public Empire(String name) {
        super(name);
    }

    @Override
    public void afficheCamps() {
        System.out.println("Fidèle à l'empire");
    }
}
