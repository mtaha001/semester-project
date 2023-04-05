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
        offering = new Offering();
    }
    
    @Test
    public void testGetSetINSTRUCTOR() {
        String instructor = "ZEIL, S";
        offering.setINSTRUCTOR(instructor);
        assertEquals(instructor, offering.getINSTRUCTOR());
    }
    
    @Test
    public void testGetSetCRSE() {
        String crse = "350";
        offering.setCRSE(crse);
        assertEquals(crse, offering.getCRSE());
    }
    
    @Test
    public void testGetSetOVERALLENR() {
        String overallEnr = "45";
        offering.setOVERALLENR(overallEnr);
        assertEquals(overallEnr, offering.getOVERALLENR());
    }
    
    @Test
    public void testGetSetOVERALLCAP() {
        String overallCap = "60";
        offering.setOVERALLCAP(overallCap);
        assertEquals(overallCap, offering.getOVERALLCAP());
    }
    
}
