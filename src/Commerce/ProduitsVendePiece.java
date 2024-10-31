package Commerce;

public interface ProduitsVendePiece {
    public default double vendre(double quantiteProduitsVendue){
        return 0;
    }
}
