package Commerce;

public interface ProduitsVendeEnSolde {
    public default double lancerSolde(double pourcentage){
        return 0;
    }
    public default double terminerSolde(double pourcentage){
        return 0;
    }
}
