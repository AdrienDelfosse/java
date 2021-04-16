package be.technifutur.starwars;

public class Scenario1 {
    public static void main(String[] args) {
        Vaisseau v1 = new Vaisseau("Millénium");
        Vaisseau v2 = new Vaisseau("Xwing");
        v1.setNbMissiles(10);
        System.out.println("Il y a très très longtemps dans une galaxie très très lointaine...");
        System.out.println("Le vaisseau : " + v1.getName() + " a " + v1.getNbMissiles() + " missile(s)");

    }
}
