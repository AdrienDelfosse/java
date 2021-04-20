package be.technifutur.starwars;

public class Soldat extends Rebelle {


    public Soldat(String name) {
        super(name);
    }

    @Override
    public void combattre() {
        System.out.println("Se bat au blaster");
    }
}
