public class partDeGalette {

    private float poidsPart;
    private boolean feve;

    public partDeGalette(){
        poidsPart = 0;
        feve = false;
    }

    public partDeGalette(float poidsPart, boolean feve){
        this.poidsPart = poidsPart;
        this.feve = feve;
    }

    //getter, setter
    public float getpoidsPart() {
        return this.poidsPart = poidsPart;
    }

    public boolean getfeve(){
        return this.feve;
    }
}
