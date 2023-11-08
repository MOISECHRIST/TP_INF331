package concept;
public class Voiture{
    private String nom;
    private int puissance;
    private boolean estDemarree;
    private double vitesse;

    public Voiture(String nom, int puissance, boolean estDemarree, double vitesse){
        this.nom=nom;
        this.puissance=puissance;
        this.vitesse=vitesse;
        this.estDemarree=estDemarree;
    }
    public int deQuellePuissance(){
        return puissance;
    }

    public void demarre(){
        estDemarree=true;
    }

    public void accelere(double v){
        if(estDemarree){
            vitesse=vitesse+v;
        }
    }

    public void afficher(){
        System.out.println("Voiture : "+this.toString());
        System.out.println("Nom : "+nom);
        System.out.println("Puissance : "+puissance);
        System.out.println("Vitesse : "+vitesse);
        System.out.println("Est demarree : "+estDemarree);
    }
}
