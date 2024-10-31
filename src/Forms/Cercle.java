package Forms;
import PointVersion.*;
public class Cercle {
    private double x , y , rayon;
    public Cercle(double x , double y , double rayon){
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }
    public void  deplaceCentre( int dx , int dy){
        x += dx;
        y += dy;
    }
    public void  changeRayon(double rayon){
        this.rayon = rayon;
    }
    public Point getCentre(){
        return new Point(x,y);
    }
    public void affiche(){
        System.out.println("X : " + x + " Y : " + y + " Rayon : " + rayon);
    }

}
