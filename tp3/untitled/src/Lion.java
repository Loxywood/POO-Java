import java.util.ArrayList;

public class Lion extends Animal {

    public Lion(String nom) {
        super(nom, TYPE.LION);
    }

    @Override
    public void manger() {
        System.out.println("Manger");
    }

    @Override
    public void rencontrer(Animal animal, Savane savane) {
        ArrayList<Animal> bidule = savane.getAnimaux();
        if (animal instanceof Lion) {
            //Différencier les sexes :
            if(animal.getSex()==this.getSex()){

                double proba = Math.random();
                if(proba>=0.3) {

                    double prob2 = Math.random();
                    if(prob2>=0.5) {
                        bidule.remove(animal);
                    }
                    else  {
                        bidule.remove(this);
                    }
                }
                else {
                    bidule.remove(animal);
                    bidule.remove(this);
                }
            }
            else  {
                Lion lion = new Lion(this.getNom()+animal.getNom());
            }
        }
        else{
            bidule.remove(this);
        }
    }
}
