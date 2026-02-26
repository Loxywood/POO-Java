import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JeuDeMastermind partie = new JeuDeMastermind(10,4);
        partie.genererCode();
        ArrayList<Compteur> code = partie.getCodeSecret();

        //Pour vérifier que le code se soit bien généré.
        for(Compteur c : code){
            System.out.println(c.getValeur());
        }

        partie.saisirCode();
        System.out.println(partie.codeCorrecte());

        System.out.println(partie.chiffreMalPlace(0));
    }
}