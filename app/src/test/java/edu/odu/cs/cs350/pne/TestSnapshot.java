
/*
 * Unit testing for the Snapshot
 */
package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// import org.junit.jupiter.api.BeforeEach;



import java.util.ArrayList;

public class TestSnapshot { 

    private Snapshot snapshot1;
    

    @BeforeEach
    public void setUp() {
        snapshot1 = new Snapshot();
    }

    @Test
    void testDefaultConstructorSnapshot() {

        // Ensure that the getSections() method returns an empty ArrayList
        ArrayList<Section> sections = snapshot1.getSections();
        assertEquals(0, sections.size());
        
    }


    @Test
    public void testGetSectionsOfSnapshot() {

        Section section1 = new Section();
        Section section2 = new Section();
        ArrayList<Section> sectionsOfSnapshot1 = snapshot1.getSections();
        sectionsOfSnapshot1.add(section1);
        sectionsOfSnapshot1.add(section2);
        assertEquals(sectionsOfSnapshot1, snapshot1.getSections());

    }

    @Test
    public void testSetSectionsOfSnapshot() {

        ArrayList<Section> sections = new ArrayList<>();
        Section section1 = new Section();
        Section section2 = new Section();
        sections.add(section1);
        sections.add(section2);
        snapshot1.setSections(sections);
        ArrayList<Section> sectionsOfSnapshot1 = snapshot1.getSections();
        assertEquals(2, sectionsOfSnapshot1.size());
        assertEquals(section1, sectionsOfSnapshot1.get(0));
        assertEquals(section2, sectionsOfSnapshot1.get(1));

    }





    

}
