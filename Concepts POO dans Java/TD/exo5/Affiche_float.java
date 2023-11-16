package TD.exo5;

public class Affiche_float extends Affichable{
    private float i;
    public Affiche_float(float i){
        this.i=i;
    }
    public void affiche(){
        System.out.println("Je suis un flottant de valeur "+i);
    }    
}
