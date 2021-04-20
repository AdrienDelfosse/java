package be.technifutur.starwars;

public class Sith extends Empire implements Force {
    public Sith(String name) {
        super(name);
    }

    @Override
    public void utiliseForce() {
        System.out.println("J'utilise le mauvais coté de la force");
    }


    @Override
    public void combattre() {
        System.out.println("Se bat au sabre laser");
    }
}
