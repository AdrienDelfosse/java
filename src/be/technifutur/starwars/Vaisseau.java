package be.technifutur.starwars;

public class Vaisseau {

    private String name;
    private int nbMissiles;

    public Vaisseau(String name){
        this.name = name;
    }

    public String getName(){
       return this.name;
    }

    public int getNbMissiles(){
        return this.nbMissiles;
    }


    public void setNbMissiles(int nbMissiles) {
        this.nbMissiles = nbMissiles;
    }
}
