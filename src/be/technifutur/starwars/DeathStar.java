package be.technifutur.starwars;

public class DeathStar {

    public void attirerVaisseau(AbstractVaisseau v) {
        if (v instanceof Millenium) {
            attirerVaisseau((Millenium) v);
        } else {
            if (v instanceof Xwing) {
                attirerVaisseau((Xwing) v);
            }else{
                System.out.println(v.getName() + " attiré");
                v.afficheCamps();
                v.decoler();
            }
        }
    }

    public void attirerVaisseau(Xwing x) {
        System.out.println(x.getName() + " attiré");
        System.out.println("A vos ordres Dark Vador");
        x.decoler();

    }

    public void attirerVaisseau(Millenium m) {
        System.out.println(m.getName() + " attiré");
        System.out.println("Au secours Obi-Wan");
        m.decoler();

    }

}
