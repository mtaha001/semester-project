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
    
    @BeforeEach
    public void setUp() {
        section = new Section();
    }

    @Test
    public void testGetCRN(){
        section.setCRN(26518);
        assertEquals(26518, section.getCRN());
        
    }

    @Test
    public void testGetSUBJ() {
        section.setSUBJ("CS");
        assertEquals("CS", section.getSUBJ());
    }

    @Test
    public void testGetCRSE(){
        section.setCRSE("350");
        assertEquals("350", section.getCRSE());
    }

    @Test
    public void testGetENR(){
        section.setENR(50);
        assertEquals(50, section.getENR());
    }
    
    @Test
    public void testGetXLSTCAP(){
        section.setXLSTCAP(100);
        assertEquals(100, section.getXLSTCAP());
    }

    @Test 
    public void testGetXLSTGROUP(){
        section.setXLSTGROUP("CS-350");
        assertEquals("CS-350", section.getXLSTGROUP());
    }

    @Test void testGetOVERALLCAP(){
        section.setOVERALLCAP(200);
        assertEquals(200, section.getOVERALLCAP());
    }

    @Test void testGetOVERALLENR(){
        section.setOVERALLENR(200);
        assertEquals(200, section.getOVERALLENR());;
    }
    



    

    

    
    
    

    
}


