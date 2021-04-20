package be.technifutur.starwars;

public class Clone extends Empire {
    public Clone() {
        super("Clone");
    }

    @Override
    public void combattre() {
        System.out.println("Se bat au blaster");
    }
}
