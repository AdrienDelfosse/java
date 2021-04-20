package be.technifutur.starwars;

public class Jedi extends Rebelle implements Force {


    public Jedi(String name) {
        super(name);
    }

    @Override
    public void utiliseForce() {
        System.out.println("J'utilise le bon coté de la force");
    }


    @Override
    public void combattre() {
        System.out.println("Se bat au sabre laser");
    }
}
