package item.instrument;

import enums.GuitarType;
import enums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("wood", "red", InstrumentType.STRING, GuitarType.ACOUSTIC, 6);
    }

    @Test
    public void hasMaterial() {
        assertEquals("wood", guitar.getMaterial());
    }
    @Test
    public void hasColour() {
        assertEquals("red", guitar.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }

    @Test
    public void hasGuitarType() {
        assertEquals(GuitarType.ACOUSTIC, guitar.getGuitarType());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(6,guitar.getNumberOfString());
    }

}