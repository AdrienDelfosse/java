package be.technifutur.starwars;

public abstract class Personnage {
    private String name;

    public Personnage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void afficheCamps();

    public abstract void combattre();
}
