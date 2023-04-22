/*
 * Unit testing for the Semester class 
 */
package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



class TestSemester {

        
    @Test
    void yieldsCorrectDirAndCode() throws IOException {
        // Tests that the correct Semester codes and directoryLocations
        // are created for Semester objects

        // NOTE: I know that these semester directory paths are local and so the tests
        // will only pass on my machine.
        // I've been looking through the course lectures for guidance on how to use the
        // test-data directories
        // for these tests in a way that will work on any machine, but i can't find any.
        // I tried using the relative paths to the semester directories, but that
        // wouldn't work.
        String s1Dir = "/src/test/data/202010"; //"src\\test\\data\\202010"
        Path s1DataPath = Path.of(System.getProperty("user.dir"), s1Dir);

        ArrayList<String> HistoricalEnrDirectories = new ArrayList<String>();
        HistoricalEnrDirectories.add(s1DataPath.toString());

        String s2Dir = "src/test/data/202120";
        Path s2DataPath = Path.of(System.getProperty("user.dir"), s2Dir);
        HistoricalEnrDirectories.add(s2DataPath.toString());

        // Semester should have a constructor that takes a directory as parameter
        Semester s1 = new Semester(HistoricalEnrDirectories.get(0));
        assertNotNull(s1.getDirLoc(), "semester should have a directory location");
        assertEquals(s1.getDirLoc(),s1DataPath.toString());
        assertNotNull(s1.getCode(), "semester should have a code");
        assertEquals(s1.getCode(), "202010");

        Semester s2 = new Semester(HistoricalEnrDirectories.get(1));
        assertNotNull(s2.getDirLoc(), "semester should have a directory location");
        assertEquals(s2.getDirLoc(),s2DataPath.toString());
        assertNotNull(s2.getCode(), "semester should have a code");
        assertEquals(s2.getCode(), "202120");

    }

    @Test
    void yieldsCorrectYearAndSeason() throws IOException {

        ArrayList<String> HistoricalEnrDirectories = new ArrayList<String>();

        String s1Dir = "src/test/data/202010";
        Path s1DataPath = Path.of(System.getProperty("user.dir"), s1Dir);
        HistoricalEnrDirectories.add(s1DataPath.toString());


        String s2Dir = "src/test/data/202120";
        Path s2DataPath = Path.of(System.getProperty("user.dir"), s2Dir);
        HistoricalEnrDirectories.add(s2DataPath.toString());

        String s3Dir = "src/test/data/202230";
        Path s3DataPath = Path.of(System.getProperty("user.dir"), s3Dir);
        HistoricalEnrDirectories.add(s3DataPath.toString());

        Semester s1 = new Semester(HistoricalEnrDirectories.get(0));
        assertNotNull(s1.getYear(), "semester should have an associated year");
        assertEquals(s1.getYear(), 2020);
        assertNotNull(s1.getSeason(), "semester should have an associated season");
        assertEquals(s1.getSeason(), "Fall");

        Semester s2 = new Semester(HistoricalEnrDirectories.get(1));
        assertNotNull(s2.getYear(), "semester should have an associated year");
        assertEquals(s2.getYear(), 2021);
        assertNotNull(s2.getSeason(), "semester should have an associated season");
        assertEquals(s2.getSeason(), "Spring");

        Semester s3 = new Semester(HistoricalEnrDirectories.get(2));
        assertNotNull(s3.getYear(), "semester should have an associated year");
        assertEquals(s3.getYear(), 2022);
        assertNotNull(s3.getSeason(), "semester should have an associated season");
        assertEquals(s3.getSeason(), "Summer");

    }

    @Test
    void yieldsCorrectDates() throws IOException {
        String s1Dir = "src/test/data/202220";
        Path s1DataPath = Path.of(System.getProperty("user.dir"), s1Dir);
        String directoryPath = s1DataPath.toString();

        Semester s1 = new Semester(directoryPath);
        assertNotNull(s1.getPreRegDate(), "semester should have a pre-registration date.");
        assertEquals(s1.getPreRegDate(), "2022-10-31");
    }


     
    @Test
    public void testFetchFiles() throws IOException {
        //Could probably be rewritten to use the test data but passes as is:

        // Create a temporary directory and some files
        Path tempDir = Files.createTempDirectory("202220");
        File datesFile = new File(tempDir.toFile(), "dates.txt");
        File csvFile1 = new File(tempDir.toFile(), "file1.csv");
        File csvFile2 = new File(tempDir.toFile(), "file2.csv");
    
        // Write some data to the files
        Files.write(datesFile.toPath(), Arrays.asList("2022-01-01", "2022-01-15"));
        Files.write(csvFile1.toPath(), Arrays.asList("header1", "data1"));
        Files.write(csvFile2.toPath(), Arrays.asList("header2", "data2"));
    
        // Create a Semester object for the temporary directory
        Semester semester = new Semester(tempDir.toString());
    
        // Fetch the files
        List<File> csvFiles = semester.fetchFiles();
    
        // Check that the files were fetched correctly
        assertEquals(2, csvFiles.size());
        assertTrue(csvFiles.contains(csvFile1));
        assertTrue(csvFiles.contains(csvFile2));
        assertEquals("2022-01-01", semester.getPreRegDate());
        assertEquals("2022-01-15", semester.getAddDeadlineDate());
        
        // Clean up the temporary directory and files
        Files.deleteIfExists(datesFile.toPath());
        Files.deleteIfExists(csvFile1.toPath());
        Files.deleteIfExists(csvFile2.toPath());
        Files.deleteIfExists(tempDir);
        
    }
  

    /**Tests that Semester creates complete array of Snapshots
     * from the .csv files in its directory.*/
    @Test
    void yieldsSnapshotsArray() throws IOException {
        String s1Dir = "src/test/data/202220";
        Path s1DataPath = Path.of(System.getProperty("user.dir"), s1Dir);
        String directoryPath = s1DataPath.toString();

        Semester s1 = new Semester(directoryPath);
        //assertNotNull(s1.getSnapshots());
        assertEquals(s1.getSnapshots().size(), 156);
        
    }

}
