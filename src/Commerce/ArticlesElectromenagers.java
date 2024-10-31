package Commerce;

public class ArticlesElectromenagers extends Articles implements ProduitsVendeEnSolde,ProduitsVendePiece{
    public double lancerSolde(double pourcentage){
        prixVente = prixVente * pourcentage;
        return prixVente;
    }
    public double terminerSolde(double pourcentage){
        prixVente = prixVente / pourcentage;
        return prixVente;
    }
    public double vendre(double quantiteProduitsVendue){
        return (quantiteProduitsVendue * prixVente);
    }
    public void presenter(){
        super.presenter();
    }
    public void remplirStock(){

    }
    public ArticlesElectromenagers(double prixAchat, double prixVente, String nomProduit, String nomFournisseur,int nombrePiecesStock) {
        super(prixAchat,prixVente,nomProduit,nomFournisseur);
        this.nombrePiecesStock = nombrePiecesStock;
    }
    private int nombrePiecesStock;

}
