package edu.odu.cs.cs350.pne;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvBindByName;
import java.util.List;

/**Represents a course offering. */
public class Offering {

    private List<Section> sections;

    @CsvBindByName(column = "INSTRUCTOR")
    private String INSTRUCTOR;

    @CsvBindByName(column = "CRSE")
    private String CRSE; //course
    
    // @CsvBindByName(column = "OVERALL ENR")
    // private int OVERALLENR; //overall enrollment

    // @CsvBindByName(column = "OVERALL CAP")
    // private int OVERALLCAP; //overall capacity

    private String courseName;

    private int OVERALLENR;

    private int OVERALLCAP;

    /**
    * Constructs a new Offering object with the specified course name and list of Section objects.
    * Initializes the object's overall capacity and overall enrollment based on the current values of the sections.
    * @param courseName the name of the course offered
    * @param sections the List of Section objects offered for the course
    */
    public Offering(String courseName, List<Section> sections) {
        this.courseName = courseName;
        this.sections = sections;
        this.OVERALLCAP = getOVERALLCAP();
        this.OVERALLENR = getOVERALLENR();
        
    }
    
    /**
     * getINSTRUCTOR()
     * Accessor
     * @return the INSTRUCTOR
     */
    public String getINSTRUCTOR() {
        return INSTRUCTOR;
    }

    /**
     * getCRSE()
     * Accessor
     * @return the CRSE
     */
    public String getCRSE(){
        return CRSE;
    }

    /**
     * getOVERALLENR()
     * Accessor
     * @return the OVERALLENR
     */
    public int getOVERALLENR(){
        int total = 0;
        for (Section section : sections) {
            total += section.getOVERALLENR();
        }
        return total;
    }

    /**
     * getOVERALLCAP()
     * Accessor
     * @return the OVERALLCAP
     */
    public int getOVERALLCAP(){
        int total = 0;
        for (Section section : sections) {
            total += section.getOVERALLCAP();
        }
        return total;
    }

    /** setINSTRUCTOR()
     * Mutator
     * @param instructor the instructor to attribute to the 
     *  Offering.
     */
    public void setINSTRUCTOR(String instructor) {
        this.INSTRUCTOR = instructor;
    }

    /** setCRSE()
     * Mutator
     * @param crse the course to attribute to the 
     *  Offering.
     */
    public void setCRSE(String crse){
        this.CRSE = crse;
    }

    /** setOVERALLENR()
     * Mutator
     * @param overallenr the total number of students enrolled
     * in the offering to attribute to the Offering.
     */
    public void setOVERALLENR(int overallenr){
        this.OVERALLENR = overallenr;
    }

    /** setOVERALLCAP()
     * Mutator
     * @param overallcap the The maximum number of students that can enroll
     * in the offering
     */
    public void setOVERALLCAP(int overallcap){
        this.OVERALLCAP = overallcap;
    }

    /**
    * Returns the list of Section objects stored in this object.
    * @return a List containing the Section objects stored in this object
    */
    public List<Section> getOfferings() {
        return sections;
    }

    /**
    * Sets the list of Section objects stored in this object to the specified List of Section objects.
    * @param sections the List of Section objects to be set as the new list of offerings for this object
    */
    public void setOfferings(List<Section> sections) {
        this.sections = sections;
    }


}