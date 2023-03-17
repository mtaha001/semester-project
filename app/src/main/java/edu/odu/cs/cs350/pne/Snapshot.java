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

    private ArrayList<Section> sections;
    private LocalDate date;


    //default constructor
    public Snapshot(){
        
    }

    public public ArrayList<Section> getSections() {
        return sections;
    }
        
    
    



    
}
