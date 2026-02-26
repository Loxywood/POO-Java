import java.util.List;

public abstract class MangeurDeGalette {

    private float poidsGaletteMax;
    private float poidsGalette;
    private boolean feve;

    //Constructeur par défaut.
    public MangeurDeGalette(){
        float poidsGaletteMax = 0;
        feve = false;
    }


    public MangeurDeGalette(float poidsGaletteMax, boolean feve){
        this.poidsGaletteMax = poidsGaletteMax;
        this.feve = feve;
    }

    //getter, setter.
    public float getPoidsGaletteMax(){
        return this.poidsGaletteMax;
    }

    public float getPoidsGalette(){
        return this.poidsGalette;
    }

    public boolean getFeve(){
        return this.feve;
    }

    /*public void setPoidsGaletteMax(float poidsGaletteMax){
        this.poidsGaletteMax = poidsGaletteMax;
    }

    public void setPoidsGalette(float poidsGalette){
        this.poidsGalette = poidsGalette;
    }

    public void setFeve(boolean feve){
        this.feve = feve;
    }*/

    public void manger(partDeGalette part){
        this.poidsGalette += part.getpoidsPart();
    }

    //Méthode abstraite.
    public abstract partDeGalette rechercheDeParts(List<partDeGalette> parts);
}
