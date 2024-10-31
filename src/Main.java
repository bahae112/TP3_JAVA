import PointVersion.*;
public class Main{
    public static void main (String args[])
    {System.out.println ("-------------------Exercices polymorphismes -----------------------------------") ;
        Point p = new Point (2, 4) ;
        PointNom pn1 = new PointNom (2, 4, 'A') ;
        PointNom pn2 = new PointNom (2, 4, 'B') ;
        System.out.println (pn1.identique(pn2)) ;
        System.out.println (p.identique(pn1)) ;
        System.out.println (pn1.identique(p)) ;
        System.out.println (Point.identiques(pn1, pn2)) ;
        System.out.println ("-------------------Exercices polymorphismes - EXO3-----------------------------------") ;
        Animal [] animal  = new Animal[4];
        animal[0] = new Animal();
        animal[1] = new Chat();
        animal[2] = new Animal();
        animal[3] = new Chat();
        for ( int i = 0 ; i < animal.length ; i++ ){
            animal[i].decrire() ;
        }
        System.out.println ("-------------------Exercices polymorphismes - EXO4-deja fait------------ ------------") ;
        System.out.println ("-------------------Exercices polymorphismes - EXO5-----------------------------------") ;
        Zoo.Zoo [] z = new Zoo.Zoo[3];
        /*
        z[0].animal = new Zoo.Animal[4];
        z[0].animal[0] = new Zoo.Chien();
        z[0].animal[1] = new Zoo.Chat();
        z[0].animal[2] = new Zoo.Chat();
        for ( int i = 0 ; i < z.length ; i++ ){
            z[0].animal[i].Ecrire();
        }
        */

    }
}