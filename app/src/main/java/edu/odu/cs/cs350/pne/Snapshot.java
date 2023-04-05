/*
 * Snapshot class, as written in the UML diagram
 * A Snapshot contains multiple Sections.
 */
package edu.odu.cs.cs350.pne;

import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;



public class Snapshot {

    // ArrayList to hold the sections in this snapshot
    private ArrayList<Section> sections;

    private LocalDate date;

    // Constructor to initialize the ArrayList
    public Snapshot() {
        sections = new ArrayList<>();
    }

    // Getter for the ArrayList of sections
    public ArrayList<Section> getSections() {
        return sections;
    }

    // Setter for the ArrayList of sections
    public void setSections(ArrayList<Section> sections) {
        this.sections = sections;
    }

    // Method to add a section to the ArrayList
    public void addSection(Section section) {
        sections.add(section);
    }
        
    
    



    
}
