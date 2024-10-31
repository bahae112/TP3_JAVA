package Commerce;

public class Articles {
    public double calculerTauxRendement(){
        return (prixAchat / prixVente);
    }
    public void presenter(){
        System.out.println("le prix d'achat : " + prixAchat);
        System.out.println("le prix dde vente : " + prixVente);
        System.out.println("le nom du produit: " + nomProduit);
        System.out.println("le nom du fournisseur: " + nomFournisseur);
        System.out.println("le rendement c'est : " + this.calculerTauxRendement());
    }
    public void RemplirStock(){

    }
    public Articles(double prixAchat, double prixVente, String nomProduit, String nomFournisseur) {
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.nomProduit = nomProduit;
        this.nomFournisseur = nomFournisseur;
    }
    protected double prixAchat,prixVente;
    protected String nomProduit,nomFournisseur;

}
