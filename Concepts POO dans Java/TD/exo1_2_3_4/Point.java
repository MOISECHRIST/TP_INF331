package TD.exo1_2_3_4;
import java.lang.Math;
public class Point{

	//Attributs de la classe Point
	protected double abscisse,ordonnee;

	public Point(double abscisse, double ordonnee){
		this.abscisse=abscisse;
		this.ordonnee=ordonnee;
	}
	//Initialiser un point avec les coordonées abscisse et ordonnee
	public void initialiser(double abscisse, double ordonnee){
		this.abscisse=abscisse;
		this.ordonnee=ordonnee;
	}

	public void identifier(){
        System.out.println("Je suis un point");
    }

	//Methode pour deplacer un point
	public void deplacer(double dabscisse, double dordonnee){
		abscisse+=dabscisse;
		ordonnee+=dordonnee;
	}

	//Accesseur de l'attribut abscisse
	public double get_abscisse(){
		return abscisse;
	}

	//Accesseur de l'attribut ordonnee
	public double get_ordonnee(){
                return ordonnee;
        }

	//Modificateur de l'attribut abscisse
	public void set_abscisse(double abscisse){
                this.abscisse=abscisse;
        }

	//Modificateur de l'attribut ordonnee
	public void set_ordonnee(double ordonnee){
                this.ordonnee=ordonnee;
        }

	//Methode pour afficher les coordonnées d'un point
	public void afficher(){
		System.out.println("Je suis le point de coordonnées "+abscisse+" et "+ordonnee);
	}

	//Methode pour calculer la distance entre un point acruelet un point distant
	public double distance(Point p){
		return Math.sqrt(Math.pow(abscisse-p.get_abscisse(),2)+Math.pow(ordonnee-p.get_ordonnee(),2));
	}
    public void colorer(byte b) {
    }
}
