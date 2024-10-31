package Zoo;

public class Animal {
    public void Ecrire(){
        System.out.println("Je suis un animal quelconque ....");
    }
    private String nom,race,bruit;
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setRace(String race) {
        this.race = race;
    }
    public void setBruit(String bruit) {
        this.bruit = bruit;
    }
}
