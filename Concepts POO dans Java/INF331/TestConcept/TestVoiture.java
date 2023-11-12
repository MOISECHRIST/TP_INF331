package INF331.TestConcept;
import INF331.Concept.Voiture;
public class TestVoiture {
    public static void main(String[] args){
        System.out.println("\n---Initialisation---\n");
        Voiture voiture1= new Voiture("labaBerline110", 6, false, 0);
        Voiture voiture2= new Voiture("maClio", 4, true, 179.8);
        Voiture voiture3= new Voiture("205Gti",6,true,250);
        
        voiture1.afficher();
        System.out.println("\n");
        voiture2.afficher();
        System.out.println("\n");
        voiture3.afficher();
        System.out.println("\n");

        System.out.println("\n---Demarrage de "+voiture1.toString()+"---\n");
        voiture1.demarre();
        voiture1.accelere(100);
        voiture1.afficher();
        System.out.println("\n");
        System.out.println("\n---Apres affectation de "+voiture1.toString()+" a "+voiture2.toString()+"---\n");
        voiture2=voiture1;
        voiture2.afficher();
        System.out.println("\n");
    }
}
