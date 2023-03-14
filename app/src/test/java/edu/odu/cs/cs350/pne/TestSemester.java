/*
 * Unit testing for the Semester class 
 */
package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class TestSemester {
    @Test
    void inputHistoricalEnrDirectory() {
        // Tests that the correct Semester objs are created for each
        // historical enrollment directory provided.

        // List of directories will be read into an ArrayList.
        ArrayList<String> HistoricalEnrDirectories = new ArrayList<String>();
        HistoricalEnrDirectories.add("201710/");
        HistoricalEnrDirectories.add("201810/");

        // new Semester obj should be created for each semester directory in the list.
        // whether a driver or the Semester class itself should do this isn't known yet.

        // Semester should have a constructor that takes a directory as parameter
        Semester s1 = new Semester(HistoricalEnrDirectories.get(0));
        assertNotNull(s1.getCode(), "semester should have a code");
        assertEquals(s1.getCode(), "201710");

        Semester s2 = new Semester(HistoricalEnrDirectories.get(1));
        assertNotNull(s2.getCode(), "semester should have a code");
        assertEquals(s2.getCode(), "201810");

    }

    // Add more tests regarding the Semester class below..
}
