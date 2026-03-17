enum TYPE {
    ZEBRE,
    LION
}

public abstract class Animal {

    private String nom;
    private int sex;
    private TYPE type;
    //private String sleeps;

    public Animal(String nom, TYPE type) {
        this.nom = nom;
        this.type = type;
        this.sex = (int)Math.random()*2;
    }

    public String getNom() {
        return this.nom;
    }

    public int getSex() {
        return sex;
    }

    public TYPE getType() {
        return this.type;
    }


    public abstract void manger();

    public void dormir() {
        System.out.println("Je dors dans la savane ("+this.nom+").");
    }

    public abstract void rencontrer(Animal animal, Savane savane);
}
