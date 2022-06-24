package item.instrument;

import enums.GuitarType;
import enums.InstrumentType;

public class Guitar extends Instrument {

    private GuitarType guitarType;
    private int numberOfString;

    public Guitar(String material, String colour, InstrumentType instrumentType, GuitarType guitarType, int numberOfString) {
        super(material, colour, instrumentType);
        this.guitarType = guitarType;
        this.numberOfString = numberOfString;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public int getNumberOfString() {
        return numberOfString;
    }
}
