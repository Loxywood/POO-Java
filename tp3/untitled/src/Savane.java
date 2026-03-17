import java.lang.reflect.Array;
import java.util.ArrayList;

public class Savane {

    private ArrayList<Animal> animaux;

    public Savane(ArrayList<Animal> animaux){
        this.animaux = animaux;
    }

    public ArrayList<Animal> getAnimaux() {
        return animaux;
    }
    public void setAnimaux(ArrayList<Animal> animaux) {
        this.animaux = animaux;
    }

    public void mangerDansLaSavane(){
        for(Animal a : animaux){
            a.manger();
        }
    }

    public void dormirDansLaSavane(){
        for(Animal a : animaux){
            a.dormir();
        }
    }

    public void rencontre(){
        Animal a1 = this.animaux.get((int)Math.random()*this.animaux.size());
        Animal a2 = this.animaux.get((int)Math.random()*this.animaux.size());
    }
}
