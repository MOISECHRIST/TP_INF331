import java.util.Scanner;
import TD.exo5.Affichable;
import TD.exo5.Affiche_Int;
import TD.exo5.Affiche_float;
public class TestAfficheExo5{
    public static void main(String args[]){
        Affichable tab[];
        Scanner scanner=new Scanner( System.in) ;
        System.out.print(" Entrer le nombre d'element : " );
        int nb_elt=scanner.nextInt();
        while (nb_elt<=0) {
            System.out.println("Erreur de saisie...");
            System.out.print(" Entrer le nombre d'element : " );
            nb_elt=scanner.nextInt();
        }
        tab=new Affichable[nb_elt];
        int i,choix;
        int x;
        float y;
        for(i=0;i<nb_elt;i++){
            System.out.println("Iteration N°"+(int)(i+1));
            System.out.print(" Faire un choix [0=Entier/1=Flottant] : " );
            choix=scanner.nextInt();
            while (choix<0||choix>1) {
                System.out.println("Erreur de saisie...");
                System.out.print(" Faire un choix [0=Entier/1=Flottant] : " );
                choix=scanner.nextInt();
            }
            
            if(choix==0){
                System.out.print(" Valeur entiere : " );
                x=scanner.nextInt();
                tab[i]=new Affiche_Int(x);
            }
            else{
                System.out.print(" Valeur flottante : " );
                y=scanner.nextFloat();
                tab[i]=new Affiche_float(y);
            }
        }
        for(i=0;i<nb_elt;i++){
            tab[i].affiche();
        }
    }
}
