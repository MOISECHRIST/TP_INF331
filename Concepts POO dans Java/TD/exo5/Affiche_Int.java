package TD.exo5;

public class Affiche_Int extends Affichable{
    private int i;
    public Affiche_Int(int i){
        this.i=i;
    }
    public void affiche(){
        System.out.println("Je suis un entier de valeur "+i);
    }    
}
