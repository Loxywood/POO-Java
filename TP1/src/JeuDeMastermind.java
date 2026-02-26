import java.util.ArrayList;
import java.util.Scanner;

public class JeuDeMastermind {
    private static int essais;
    private static int nbChiffres;
    private ArrayList<Compteur> CodeSecret;
    private ArrayList<Compteur> CodeTrouve;

    public JeuDeMastermind() {
            essais = 0;
            nbChiffres = 0;
            this.CodeSecret = new ArrayList<Compteur>(nbChiffres);
            this.CodeTrouve = new ArrayList<Compteur>(nbChiffres);
    }

    public JeuDeMastermind(int essais, int nbChiffres) {
        this.essais = essais;
        this.nbChiffres = nbChiffres;
        this.CodeSecret = new ArrayList();
        this.CodeTrouve = new ArrayList();
    }

    public void genererCode(){
        for (int i = 0; i < nbChiffres; i++) {
            Compteur x = new Compteur();
            x.setValeur(x.tirerValeur());
            //System.out.println("bonjour");
            this.CodeSecret.add(x);
        }
    }

    public ArrayList<Compteur> getCodeSecret(){
        return this.CodeSecret;
    }

    public ArrayList<Compteur> getCodeTrouve(){
        return this.CodeTrouve;
    }

    public void saisirCode(){
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < nbChiffres; i++) {
            int line = reader.nextInt();
            this.CodeTrouve.add(new Compteur(line));
        }
    }

    public boolean codeCorrecte(){
        for (int i = 0; i < nbChiffres; i++) {
            int x = this.getCodeSecret().get(i).getValeur();
            int y = this.getCodeTrouve().get(i).getValeur();
            if (x != y) {
                return false;
            }
        }
    return true;
    }

    public boolean chiffreMalPlace(int positionCompteur){
        int x = CodeTrouve.get(positionCompteur).getValeur(); //On récupère la valeur du compteur à la position donnée.
        //Maintenant on vérifie qu'il existe dans CodeSecret.
        for(int i=0; i<nbChiffres; i++){
            int y = getCodeSecret().get(i).getValeur();
            if((x == y)&&(i!=positionCompteur)){
                return true;
            }
        }
    return false;
    }

    public boolean codeCorrect()
}
