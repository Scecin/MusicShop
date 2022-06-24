package item.instrument;

import enums.InstrumentType;
import enums.PianoType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("wood", "brown", InstrumentType.PERCUSSION, PianoType.GRAND, 88);
    }

    @Test
    public void hasMaterial() {
        assertEquals("wood", piano.getMaterial());
    }
    @Test
    public void hasColour() {
        assertEquals("brown", piano.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.PERCUSSION,piano.getInstrumentType());
    }

    @Test
    public void hasPianoType() {
        assertEquals(PianoType.GRAND, piano.getPianoType());
    }

    @Test
    public void hasDrumStickIncluded() {
        assertEquals(88, piano.getNumberOfKeys());
    }

}