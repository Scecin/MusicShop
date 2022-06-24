package item.instrument;

import enums.DrumsType;
import enums.GuitarType;
import enums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumsTest {

    Drums drums;

    @Before
    public void before() {
        drums = new Drums("steel", "silver", InstrumentType.PERCUSSION, DrumsType.TENOR, true);
    }

    @Test
    public void hasMaterial() {
        assertEquals("steel", drums.getMaterial());
    }
    @Test
    public void hasColour() {
        assertEquals("silver", drums.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.PERCUSSION, drums.getInstrumentType());
    }

    @Test
    public void hasDrumsType() {
        assertEquals(DrumsType.TENOR, drums.getDrumsType());
    }

    @Test
    public void hasDrumStickIncluded() {
        assertTrue(drums.isDrumSticksIncluded());
    }

}