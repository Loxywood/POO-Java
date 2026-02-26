import java.util.List;

public class Gourmand extends MangeurDeGalette {

    public Gourmand(float poidsMaxGalette, boolean feve) {
        super(poidsMaxGalette, feve);
    }

    @Override
    public partDeGalette rechercheDeParts(List<partDeGalette> parts) {

        partDeGalette largestPart = parts.get(0);
        for (partDeGalette part : parts) {
            if (part.getpoidsPart()>largestPart.getpoidsPart()) {
                largestPart = part;
            }
        }

        return largestPart;
    }

}
