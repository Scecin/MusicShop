package item.instrument;

import enums.InstrumentType;
import enums.SaxophoneType;

public class Saxophone extends Instrument{

    private SaxophoneType saxophoneType;
    private int numberOfKeys;

    public Saxophone(String material, String colour, InstrumentType instrumentType, SaxophoneType saxophoneType, int numberOfKeys) {
        super(material, colour, instrumentType);
        this.saxophoneType = saxophoneType;
        this.numberOfKeys = numberOfKeys;
    }

    public SaxophoneType getSaxophoneType() {
        return saxophoneType;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
}
