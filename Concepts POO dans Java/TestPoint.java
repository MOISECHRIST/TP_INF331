import INF331.Concept.Point;
public class TestPoint{
    public static void main(String agrs[]){
        //Déclaration d'un point
        Point p1,p2;
        //Creation et allocation de la mémoire
        p1= new Point();
        p2=new Point(10, 10);
        p1.afficher();
        p2.afficher();

        //Utilisation
        Point p3= new Point(p2);
        double d=p3.distance(p1);
        p1.afficher();
        p3.afficher();
        System.out.println("Distance entre "+p1.toString()+" et "+p3.toString()+" est "+d);
    }
}
