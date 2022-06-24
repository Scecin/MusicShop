package item.instrument;

import enums.InstrumentType;
import enums.PianoType;
import enums.SaxophoneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone("brass", "gold", InstrumentType.WOODWIND, SaxophoneType.SOPRANO, 21);
    }

    @Test
    public void hasMaterial() {
        assertEquals("brass", saxophone.getMaterial());
    }
    @Test
    public void hasColour() {
        assertEquals("gold", saxophone.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.WOODWIND,saxophone.getInstrumentType());
    }

    @Test
    public void hasSaxophoneType() {
        assertEquals(SaxophoneType.SOPRANO, saxophone.getSaxophoneType());
    }

    @Test
    public void hasNumberOfKeys() {
        assertEquals(21, saxophone.getNumberOfKeys());
    }

}