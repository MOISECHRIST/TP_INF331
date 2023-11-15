package TD;

public class Pointcol extends Point{
    byte couleur;
    public void colorer(byte couleur){
        this.couleur=couleur;
    }
    public void afficher(){
        System.out.println("Je suis le poin de coordonnées "
        +super.abscisse+" et "+super.ordonnee+" et ma couleur est "
        +this.couleur);
    }

    public Pointcol(double abscisse, double ordonnee, byte couleur){
        super(abscisse,ordonnee);
        this.couleur=couleur;
    }
}
