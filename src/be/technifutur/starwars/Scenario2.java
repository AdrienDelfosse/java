package be.technifutur.starwars;

public class Scenario2 {
    public static void main(String[] args){
        DeathStar ds = new DeathStar();
        AbstractVaisseau v2 = new Millenium();
        Xwing v3 = new Xwing();
        Millenium v4 = new Millenium();

         v4.vitesseLumiere();
         System.out.println(v2.getName());
         v3.decoler();
         v4.decoler();
         v3.afficheCamps();
         v4.afficheCamps();

        ds.attirerVaisseau((Millenium) v2);
        ds.attirerVaisseau(v3);
        ds.attirerVaisseau(v4);

        System.out.println();

        System.out.println(v4.toString());





    }
}
