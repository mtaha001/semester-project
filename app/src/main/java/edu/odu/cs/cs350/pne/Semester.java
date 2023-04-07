/*
 * Semester class, as written in the UML diagram
 * A semester has multiple Snapshots and multiple Offerings.
 * 
 * In the SummaryProjectionReport class, some Semesters are used for
 * historical data, while one Semester will be used as the desired
 * projection Semester.
 */
package edu.odu.cs.cs350.pne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Semester {

    private String directoryLocation;
    private String code;
    private int year; // Academic year
    private String season; // Fall, Spring, or Summer
    private String preRegistrationDate;
    private String addDeadlineDate;
    private ArrayList<Snapshot> snapshots;
    private ArrayList<Offering> offerings;

    /*
     * Construct a Semester object
     * 
     * @param directoryLoc - String representing the directory
     *                     containing the semester's data
     * @throws IOException
     * @post condition - Semester object is created and has a directoryLocation,
     *       a semester code, year, season, List of Snapshots, preReg date,
     *       addDeadline date,
     *       and a List of Offerings.
     */
    public Semester(String directoryLoc) throws IOException {

        directoryLocation = directoryLoc;

        // Convert the directory string to a valid path string
        Path path = Paths.get(directoryLocation);
        directoryLocation = path.toString();
        System.out.println(directoryLocation);

        // Code will be the name of the last folder in the directory
        code = path.getFileName().toString();

        // Extract semester's year from its code (first 4 chars) and convert to int:
        year = Integer.parseInt(code.substring(0, 4));

        // Extract semester's season from its code (last 2 chars) and convert
        // to a representative string:
        String seasonID;
        seasonID = code.substring(4, 6);
        switch (seasonID) {
            case "10":
                season = "Fall";
                break;
            case "20":
                season = "Spring";
                break;
            case "30":
                season = "Summer";
                break;
        }

        // Create a File object representing the dates.txt file
        File file = new File(directoryLocation, "dates.txt");

        // Create a FileReader object to read the file
        FileReader fileReader = new FileReader(file);

        // Create a BufferedReader object to read the file line by line
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Read both lines of dates.txt file
        String line;
        line = bufferedReader.readLine();
        preRegistrationDate = line; // read pre-registration date

        // line = bufferedReader.readLine();

        // Close the BufferedReader
        bufferedReader.close();

        if (!file.exists()) {
            throw new IOException("Missing dates.txt in semester code.");
        }
    }

    /**
     * getCode()
     * 
     * @return the Semester's code
     */
    public String getCode() {
        return code;
    }

    /**
     * getDirLoc()
     * 
     * @return the directory of the semester's data (same as what was input
     *         to command-line)
     *         This may not be utilized.
     */
    public String getDirLoc() {
        return directoryLocation;
    }

    /**
     * getYear()
     * 
     * @return the Semester's year
     */
    public int getYear() {
        return year;
    }

    /**
     * getSeason()
     * 
     * @return the Semester's season (Fall, Spring, or Summer)
     */
    public String getSeason() {
        return season;
    }

    public String getPreRegDate() {
        return preRegistrationDate;
    }

}
