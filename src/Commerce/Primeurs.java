package Commerce;

public class Primeurs extends Articles implements ProduitsVendeKillograme{
    public  double vendre( double quantiteProduitsVendue){
        return (quantiteProduitsVendue * prixVente);
    }
    public void presenter(){
        super.presenter();
    }
    public void remplirStock(){

    }

    public Primeurs(double prixAchat, double prixVente, String nomProduit, String nomFournisseur,int quantiteStock) {
        super(prixAchat,prixVente,nomProduit,nomFournisseur);
        this.quantiteStock = quantiteStock;
    }
    private int quantiteStock;
}
