import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestSavane {
    public TestSavane() {
        Zebre z1 = new Zebre("Rodolphe");
        Lion l1 = new Lion("Taylor Swift");

        ArrayList<Animal> animaux = new ArrayList<Animal>(10);
        ArrayList<Lion> lions = new ArrayList<Lion>();

        for(int i = 0; i < 10; i++){
            for(int j=0;j<5;j++){
                Lion l = new Lion("MJ");
                animaux.add(l);
            }
            for(int j=0;j<5;j++){
                Zebre z = new Zebre("Britney Spears");
                animaux.add(z);
            }
        }
        /*lions.add(l1);
        animaux.add(l1);
        z1.dormir();*/
    }

}
