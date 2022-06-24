package item.instrument;

import enums.DrumsType;
import enums.GuitarType;
import enums.InstrumentType;

public class Drums extends Instrument{

    private DrumsType drumsType;
    private boolean drumSticksIncluded;

    public Drums(String material, String colour, InstrumentType instrumentType, DrumsType drumsType, boolean drumSticksIncluded) {
        super(material, colour, instrumentType);
        this.drumsType = drumsType;
        this.drumSticksIncluded = drumSticksIncluded;
    }

    public DrumsType getDrumsType() {
        return drumsType;
    }

    public boolean isDrumSticksIncluded() {
        return drumSticksIncluded;
    }

}
