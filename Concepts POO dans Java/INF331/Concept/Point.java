package INF331.Concept;
import java.lang.Math;
public class Point{

	//Attributs de la classe Point
	private double x,y;

	//Constructeur avec les parametres x et y
	public Point(double x, double y){
		this.x=x;
		this.y=y;
	}
	//Constructeur avec les parametres a et b retourne une erreur car la signature est la même 
	// public Point(double a, double b){
	// 	this.x=a;
	// 	this.y=b;
	// }

	//Constructeurs sans parametre
	public Point(){
		this.x=0.0;
		this.y=0.0;
	}

	//Methode pour deplacer un point
	public void deplacer(double dx, double dy){
		x+=dx;
		y+=dy;
	}

	//Accesseur de l'attribut x
	public double get_x(){
		return x;
	}

	//Accesseur de l'attribut y
	public double get_y(){
                return y;
        }

	//Modificateur de l'attribut x
	public void set_x(double x){
                this.x=x;
        }

	//Modificateur de l'attribut y
	public void set_y(double y){
                this.y=y;
        }


	//Contructeur par copie d'un autre point p
	public Point(Point p){
                this.x=p.get_x();
                this.y=p.get_y();
        }

	//Methode pour afficher les coordonnées d'un point
	public void afficher(){
		System.out.println("Point");
		System.out.println("Id : "+this.toString());
		System.out.println("X= "+x);
		System.out.println("Y= "+y);
	}

	//Methode pour calculer la distance entre un point acruelet un point distant
	public double distance(Point p){
		return Math.sqrt(Math.pow(x-p.get_x(),2)+Math.pow(y-p.get_y(),2));
	}
}
