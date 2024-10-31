package Commerce;

public class Magasins {
    public Magasins(double coutAchat,double revenues,ArticlesElectromenagers [] T1,Primeurs [] T2) {
        this.coutAchat=coutAchat;
        this.revenues=revenues;
        this.T1=T1;
        this.T2=T2;
    }
    public double calculerTauxRendement(){
        return (coutAchat / revenues);
    }
    public void presenter(){
        System.out.println("le cout d'achat : " + coutAchat);
        System.out.println("le revenues : " + revenues);
        System.out.println("les articleselectromenagers présent : ");
        for(int i=0;i<T1.length;i++){
            T1[i].presenter();
        }
        System.out.println("les primeurs présent : ");
        for(int i=0;i<T2.length;i++){
            T2[i].presenter();
        }
    }
    private double coutAchat,revenues;
    private  ArticlesElectromenagers [] T1;
    private  Primeurs [] T2;
}
