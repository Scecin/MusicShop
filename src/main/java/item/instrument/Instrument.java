package item.instrument;

import enums.GuitarType;
import enums.InstrumentType;

public abstract class Instrument {

    private String material;
    private String colour;
    private InstrumentType instrumentType;

    public Instrument(String material, String colour, InstrumentType instrumentType) {
        this.material = material;
        this.colour = colour;
        this.instrumentType = instrumentType;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getColour() {
        return this.colour;
    }

    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }
}
