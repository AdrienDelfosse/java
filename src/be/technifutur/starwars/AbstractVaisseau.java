package be.technifutur.starwars;

public abstract class AbstractVaisseau {
    private String name;
    private int nbMissiles;
    public static final int MAX_MISSILES = 5;
    private boolean enVol = false;
    private int nbEnVol = 0;

    public AbstractVaisseau(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getNbMissiles() {
        return this.nbMissiles;
    }


    public final void addMissiles(int nbr) {
        this.nbMissiles = this.nbMissiles + nbr;
        if (this.nbMissiles < 0) {
            this.nbMissiles = 0;
        } else if (this.nbMissiles > MAX_MISSILES) {
            this.nbMissiles = MAX_MISSILES;
        }
    }

    public void tirer() {
        System.out.println(this.nbMissiles > 0 ? "Pan" : "Pouf");
        addMissiles(-1);
    }

    public void tirer(int nb) {
        if (this.nbMissiles > 0) {
            for (int i = 0; i < nb; i++) {
                tirer();
            }
        }
    }

    public void atterrir() {
        if (enVol) {
            System.out.println(name + " atterri");
            enVol = false;
            this.addEnVol(-1);
        } else {
            System.out.println(name + " déjà au sol");
        }

    }

    public void decoler() {
        if (!enVol) {
            System.out.println(name + " décole");
            enVol = true;
            this.addEnVol(1);
        } else {
            System.out.println(name + " déjà en vol");
        }
    }

    public boolean isEnVol() {
        return enVol;
    }

    public void addEnVol(int a) {
        nbEnVol += a;
    }

    public int nombreEnVol() {
        return nbEnVol;
    }

    public abstract void afficheCamps();

    @Override
    public String toString() {
        return "AbstractVaisseau{" +
                "name='" + name + '\'' +
                ", nbMissiles=" + nbMissiles +
                ", enVol=" + enVol +
                '}';
    }

}
