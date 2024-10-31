class PointNom extends Point
{
    PointNom (int x, int y, char nom) {
        super (x, y) ; this.nom = nom ;
    }
    public static boolean identiques (PointNom a, PointNom b){
        return ((a.x == b.x) && (a.y == b.y) && (a.nom == b.nom));
    }
    //surcharge
    public boolean identique (PointNom a){
        return ((a.x == x) && (a.y == y) && (a.nom == nom));

    }
    private char nom ;
}