/*
 * Unit testing for the Semester class 
 */
package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;

class TestSemester {
    @Test
    void yieldsCorrectDirAndCode() throws IOException {
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
    void yieldsCorrectYearAndSeason() throws IOException {
        ArrayList<String> HistoricalEnrDirectories = new ArrayList<String>();
        HistoricalEnrDirectories.add(
                "C:\\Users\\izsnu\\OneDrive\\Documents\\ODU\\CS_350\\ENROLLMENTPROJECT\\semester-project\\app\\src\\test\\data\\201710");
        HistoricalEnrDirectories.add(
                "C:\\Users\\izsnu\\OneDrive\\Documents\\ODU\\CS_350\\ENROLLMENTPROJECT\\semester-project\\app\\src\\test\\data\\201820");
        HistoricalEnrDirectories.add(
                "C:\\Users\\izsnu\\OneDrive\\Documents\\ODU\\CS_350\\ENROLLMENTPROJECT\\semester-project\\app\\src\\test\\data\\201930");

        Semester s1 = new Semester(HistoricalEnrDirectories.get(0));
        assertNotNull(s1.getYear(), "semester should have an associated year");
        assertEquals(s1.getYear(), 2017);
        assertNotNull(s1.getSeason(), "semester should have an associated season");
        assertEquals(s1.getSeason(), "Fall");

        Semester s2 = new Semester(HistoricalEnrDirectories.get(1));
        assertNotNull(s2.getYear(), "semester should have an associated year");
        assertEquals(s2.getYear(), 2018);
        assertNotNull(s2.getSeason(), "semester should have an associated season");
        assertEquals(s2.getSeason(), "Spring");

        Semester s3 = new Semester(HistoricalEnrDirectories.get(2));
        assertNotNull(s3.getYear(), "semester should have an associated year");
        assertEquals(s3.getYear(), 2019);
        assertNotNull(s3.getSeason(), "semester should have an associated season");
        assertEquals(s3.getSeason(), "Summer");

    }

    @Test
    void yieldsCorrectDates() throws IOException {
        String directoryPath = "C:\\Users\\izsnu\\OneDrive\\Documents\\ODU\\CS_350\\ENROLLMENTPROJECT\\semester-project\\app\\src\\test\\data\\202220";

        Semester s1 = new Semester(directoryPath);
        assertNotNull(s1.getPreRegDate(), "semester should have a pre-registration date.");
        assertEquals(s1.getPreRegDate(), "2022-10-31");
    }
    // Add more tests regarding the Semester class below..
}
