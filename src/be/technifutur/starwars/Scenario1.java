package be.technifutur.starwars;

public class Scenario1 {
    public static void main(String[] args) {
        System.out.println("Il y a très très longtemps dans une galaxie très très lointaine...");
        System.out.println("Les vaisseaux ont un maximum de " + Vaisseau.MAX_MISSILES + " missiles");
        Vaisseau v1 = new Vaisseau("Millénium");
        Vaisseau v2 = new Vaisseau("Xwing");

        v1.addMissiles(0);
        v2.addMissiles(4);
        v1.tirer();
        v2.tirer(5);
        System.out.println("Le vaisseau " + v1.getName() + " a " + v1.getNbMissiles() + " missile(s)");
        System.out.println("Le vaisseau " + v2.getName() + " a " + v2.getNbMissiles() + " missile(s)");

        v1.atterrir();
        v1.decoler();
        v1.decoler();
        v1.atterrir();
        v1.decoler();
        v2.decoler();
        v2.atterrir();

        System.out.println(v2.getName() + " en vol: " + v2.nombreEnVol());
        System.out.println(v1.getName() + " en vol: " + v1.nombreEnVol());
    }
}
