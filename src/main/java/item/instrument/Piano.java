package item.instrument;

import enums.GuitarType;
import enums.InstrumentType;
import enums.PianoType;

public class Piano extends Instrument{

    private PianoType pianoType;
    private int numberOfKeys;

    public Piano(String material, String colour, InstrumentType instrumentType, PianoType pianoType, int numberOfKeys) {
        super(material, colour, instrumentType);
        this.pianoType = pianoType;
        this.numberOfKeys = numberOfKeys;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
}
