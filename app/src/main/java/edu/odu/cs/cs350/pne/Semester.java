/*
 * Semester class, as written in the UML diagram
 * A semester has multiple Snapshots and multiple Offerings.
 * A DetailedProjReport and SummaryProjReport depend on a Semester.
 */
package edu.odu.cs.cs350.pne;

import java.util.ArrayList;
import java.util.Date;

public class Semester {

    private String directoryLocation;
    private String code;
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
     *       a semester code, List of Snapshots, preReg date, addDeadline date,
     *       and a List of Offerings.
     */
    public Semester(String directoryLoc) {

    }
}
