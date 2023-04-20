/*
 * Unit testing to check offering
 */

package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
public class TestOffering {

    private Offering offering;

    @BeforeEach
    public void setUp() {
        offering = new Offering("CS471", "211655", 50, 30);
    }

    @Test
    public void testGetOVERALLENR() {
        assertEquals(30, offering.getOVERALLENR());
    }

    @Test
    public void testGetOVERALLCAP() {
        assertEquals(50, offering.getOVERALLCAP());
    }

    @Test
    public void testSetCRSE() {
        offering.setCRSE("CS");
        assertEquals("CS", offering.getCRSE());
    }

    @Test
    public void testSetOVERALLENR() {
        offering.setOVERALLENR(40);
        assertEquals(40, offering.getOVERALLENR());
    }

    @Test
    public void testSetOVERALLCAP() {
        offering.setOVERALLCAP(60);
        assertEquals(60, offering.getOVERALLCAP());
    }


    
    
}
