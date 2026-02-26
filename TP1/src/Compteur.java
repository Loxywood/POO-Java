public class Compteur {

    private int valeur;

    public Compteur(){
        valeur = 0;
    }
    public Compteur(int valeur) {
        this.valeur = valeur;
    }
    public int getValeur() {
        return valeur;
    }
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
    public int tirerValeur(){
        return (int)(Math.random()*9+1);
    }
}
