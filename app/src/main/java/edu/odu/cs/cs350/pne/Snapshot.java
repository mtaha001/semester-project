package edu.odu.cs.cs350.pne;
import java.util.ArrayList;
import java.util.Date;
import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;


/*
 * Represents a Snapshot of enrollment data
 */
public class Snapshot {

    // ArrayList to hold the sections in this snapshot
    private ArrayList<Section> sections;

    private String date;

    // Constructor to initialize the ArrayList
    public Snapshot(File csvFile) {
        sections = new ArrayList<>();
        sections.add(new Section());
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

    // Setter for the date
    public void setDate(String date) {
        this.date = date;
    }

    // Getter for the date
    public String getDate() {
        return date;
    }


    
    



    
}
