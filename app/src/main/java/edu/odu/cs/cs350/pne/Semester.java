/*
 * Semester class, as written in the UML diagram
 * A semester has multiple Snapshots and multiple Offerings.
 * 
 * In the SummaryProjectionReport class, some Semesters are used for
 * historical data, while one Semester will be used as the desired
 * projection Semester.
 */
package edu.odu.cs.cs350.pne;

import java.util.ArrayList;
import java.util.Date;

public class Semester {

    private String directoryLocation;
    private String code;
    private int year; // Academic year
    private String season; // Fall, Spring, or Summer
    private Date preRegistrationDate;
    private Date addDeadlineDate;
    private ArrayList<Snapshot> snapshots;
    private ArrayList<Offering> offerings;

    /**
     * Construct a Semester object
     * 
     * @param directoryLoc - String representing the directory
     *                     containing the semester's data
     * @post condition - Semester object is created and has a directoryLocation,
     *       a semester code, year, season, List of Snapshots, preReg date,
     *       addDeadline date,
     *       and a List of Offerings.
     */
    public Semester(String directoryLoc) {

        directoryLocation = directoryLoc;

        // Code will be the same as directory name but without slashes.
        code = directoryLoc.replaceAll("[/\\\\]", "");

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

}
