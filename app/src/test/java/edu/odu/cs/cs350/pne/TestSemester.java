/*
 * Unit testing for the Semester class 
 */
package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class TestSemester {
    @Test
    void yieldsCorrectDirAndCode() {
        // Tests that the correct Semester codes and directoryLocations
        // are created for Semester objects

        // List of directories will be read into an ArrayList.
        ArrayList<String> HistoricalEnrDirectories = new ArrayList<String>();
        HistoricalEnrDirectories.add("201710/");
        HistoricalEnrDirectories.add("201810/");

        // new Semester obj should be created for each semester directory in the list.
        // whether a driver or the Semester class itself should do this isn't known yet.

        // Semester should have a constructor that takes a directory as parameter
        Semester s1 = new Semester(HistoricalEnrDirectories.get(0));
        assertNotNull(s1.getDirLoc(), "semester should have a directory location");
        assertEquals(s1.getDirLoc(), "201710/");
        assertNotNull(s1.getCode(), "semester should have a code");
        assertEquals(s1.getCode(), "201710");

        Semester s2 = new Semester(HistoricalEnrDirectories.get(1));
        assertNotNull(s2.getDirLoc(), "semester should have a directory location");
        assertEquals(s2.getDirLoc(), "201810/");
        assertNotNull(s2.getCode(), "semester should have a code");
        assertEquals(s2.getCode(), "201810");

    }

    @Test
    void yieldsCorrectYearandSeason() {
        ArrayList<String> HistoricalEnrDirectories = new ArrayList<String>();
        HistoricalEnrDirectories.add("201710/");
        HistoricalEnrDirectories.add("201820/");
        HistoricalEnrDirectories.add("201930/");

        Semester s1 = new Semester(HistoricalEnrDirectories.get(0));
        assertNotNull(s1.getYear(), "semester should have an associated year");
        assertEquals(s1.getYear(), 2017);
        assertNotNull(s1.getSeason(), "semester should have an associated season");
        assertEquals(s1.getSeason(), "Fall");

        Semester s2 = new Semester(HistoricalEnrDirectories.get(1));
        assertNotNull(s2.getDirLoc(), "semester should have an associated year");
        assertEquals(s2.getDirLoc(), 2018);
        assertNotNull(s2.getCode(), "semester should have an associated season");
        assertEquals(s2.getCode(), "Summer");

    }
    // Add more tests regarding the Semester class below..
}
