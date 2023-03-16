/*
 * Unit testing to check section
 */
package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

public class TestSection {

    private Section section;
    
    @Before
    public void setUp() {
        section = new Section();
    }
    
    @Test
    public void testGetSetCRN() {
        String crn = "12345";
        section.setCRN(crn);
        assertEquals(crn, section.getCRN());
    }
    
    @Test
    public void testGetSetSUBJ() {
        String subj = "CS";
        section.setSUBJ(subj);
        assertEquals(subj, section.getSUBJ());
    }
    
}


