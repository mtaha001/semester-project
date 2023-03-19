
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
    

    // private Snapshot s1; 
    // private Snapshot s2; 

    // @BeforeEach
    // public void setUp (){
    //     s1 =  new Snapshot();
    // }
    private Snapshot snapshot1;
    

    @BeforeEach
    public void setUp() {
        snapshot1 = new Snapshot();
    }

    @Test
    void testDefaultConstructorSnapshot() {

        // Ensure that the getSections() method returns an empty ArrayList
        snapshot1 = new Snapshot();
        ArrayList<Section> sections = snapshot1.getSections();
        assertEquals(0, sections.size());
        
        
        
    }


    @Test
    public void testGetSections() {
        // Create some Section objects
        Section section1 = new Section();
        Section section2 = new Section();
        ArrayList<Section> sectionsOfSnapshot1 = snapshot1.getSections();
        sectionsOfSnapshot1.add(section1);
        sectionsOfSnapshot1.add(section2);
        assertEquals(sectionsOfSnapshot1, snapshot1.getSections());
    }


    

}
