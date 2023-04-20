/*
 * Unit testing to check offering
 */

package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;
public class TestOffering {
    private Offering offering;
    private List<Section> sections;

    @Test
    public void testGetINSTRUCTOR() {
        sections = new ArrayList<>();
        Section section1 = new Section();
        Section section2 = new Section();
        sections.add(section1);
        sections.add(section2);
        offering = new Offering("Test Course", sections);
        offering.setINSTRUCTOR("Test Instructor");
        String result = offering.getINSTRUCTOR();
        assertEquals("Test Instructor", result);
    }

    @Test
    public void testGetCRSE() {
        sections = new ArrayList<>();
        Section section1 = new Section();
        Section section2 = new Section();
        sections.add(section1);
        sections.add(section2);
        offering = new Offering("Test Course", sections);
        offering.setCRSE("TEST");
        String result = offering.getCRSE();
        assertEquals("TEST", result);
    }

    @Test
    public void testGetOVERALLENR() {
        Section section1 = new Section();
        section1.setOVERALLENR(20);
        Section section2 = new Section();
        section2.setOVERALLENR(30);
        List<Section> sections = new ArrayList<>();
        sections.add(section1);
        sections.add(section2);
        Offering offering = new Offering("Computer Science 101", sections);
        assertEquals(50, offering.getOVERALLENR());
    }

    @Test
    public void testGetOVERALLCAP() {
        Section section1 = new Section();
        section1.setOVERALLCAP(20);
        Section section2 = new Section();
        section2.setOVERALLCAP(30);
        List<Section> sections = new ArrayList<>();
        sections.add(section1);
        sections.add(section2);
        Offering offering = new Offering("Computer Science 101", sections);
        assertEquals(50, offering.getOVERALLCAP());
    }

   
    

    
    
}
