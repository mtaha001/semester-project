
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
    

    private Snapshot s1; 
    private Snapshot s2; 

    @BeforeEach
    public void setUp (){
        s1 =  new Snapshot();
    }

    @Test
    void testDefaultConstructor() {

        // Ensure that the getSections() method returns an empty ArrayList
        assertTrue(s1.getSections().isEmpty());
    }


    @Test
    public void testGetSections() {
        // Create some Section objects
        Section section1 = new Section("Section 1");
        Section section2 = new Section("Section 2");

        // Create an ArrayList of Section objects
        ArrayList<Section> sections = new ArrayList<>();
        sections.add(section1);
        sections.add(section2);

        // Create a Snapshot object that holds the ArrayList of Section objects
        Snapshot snapshot = new Snapshot(sections);

        // Ensure that the getSections() method returns the correct ArrayList
        assertEquals(sections, snapshot.getSections());
    }


    

}
