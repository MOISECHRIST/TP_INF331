import java.util.Scanner;
import TD.exo1_2_3_4.Point;
import TD.exo1_2_3_4.Pointcol;
public class PointExo3 {
    public static void main(String args[]){
        Point tab[];
        Scanner scanner=new Scanner( System.in) ;
        System.out.print(" Entrer le nombre d'element : " );
        int nb_elt=scanner.nextInt();
        while (nb_elt<=0) {
            System.out.println("Erreur de saisie...");
            System.out.print(" Entrer le nombre d'element : " );
            nb_elt=scanner.nextInt();
        }
        tab=new Point[nb_elt];
        int i,choix;
        double x,y;
        byte b;
        for(i=0;i<nb_elt;i++){
            System.out.println("Iteration N°"+(int)(i+1));
            System.out.print(" Faire un choix [0=Point/1=Point Colore] : " );
            choix=scanner.nextInt();
            while (choix<0||choix>1) {
                System.out.println("Erreur de saisie...");
                System.out.print(" Faire un choix [0=Point/1=Point Colore] : " );
                choix=scanner.nextInt();
            }
            System.out.print(" Abscisse : " );
            x=scanner.nextDouble();
            System.out.print(" Ordonnee : " );
            y=scanner.nextDouble();
            if(choix==0){
                tab[i]=new Point(x, y);
            }
            else{
                System.out.print(" Couleur : " );
                b=scanner.nextByte();
                tab[i]=new Pointcol(x, y, b);
            }
        }
        for(i=0;i<nb_elt;i++){
            tab[i].afficher();
        }
    }
}
