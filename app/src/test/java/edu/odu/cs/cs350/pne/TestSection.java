/*
 * Unit testing to check section
 */
package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

public class TestSection {

    @Test
    public void testGetSUBJ() {
        Section section = new Section();
        section.setSUBJ("CS");
        assertEquals("CS", section.getSUBJ());
    }
    

    
}


