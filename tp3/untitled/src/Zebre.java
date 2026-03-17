import java.util.ArrayList;

public class Zebre extends Animal {

    public Zebre(String nom) {
        super(nom, TYPE.ZEBRE);
    }

    @Override
    public void manger() {
        System.out.println("Manger");
    }

    @Override
    public void rencontrer(Animal animal, Savane savane) {
        ArrayList<Animal> bidule = savane.getAnimaux();
        if(animal instanceof Zebre) {
            if(this.getSex()!= animal.getSex()){
                Zebre zebre = new Zebre(this.getNom()+animal.getNom());
                    bidule.add(zebre);
            }
        }
        else{
            bidule.remove(this);
        }
    }
}
