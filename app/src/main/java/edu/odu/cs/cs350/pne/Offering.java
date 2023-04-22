package edu.odu.cs.cs350.pne;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvBindByName;
import java.util.List;


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


    
    public Offering(String courseName, List<Section> sections) {
        this.courseName = courseName;
        this.sections = sections;
        this.OVERALLCAP = getOVERALLCAP();
        this.OVERALLENR = getOVERALLENR();
        
    }
    
    /**
     * getINSTRUCTOR()
     * 
     * @return the INSTRUCTOR
     */
    public String getINSTRUCTOR() {
        return INSTRUCTOR;
    }

    /**
     * getCRSE()
     * 
     * @return the CRSE
     */
    public String getCRSE(){
        return CRSE;
    }

    /**
     * getOVERALLENR()
     * 
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
     * 
     * @return the OVERALLCAP
     */
    public int getOVERALLCAP(){
        int total = 0;
        for (Section section : sections) {
            total += section.getOVERALLCAP();
        }
        return total;
    }

    // setter for INSTRUCTOR
    public void setINSTRUCTOR(String instructor) {
        this.INSTRUCTOR = instructor;
    }

    //setter for CRSE
    public void setCRSE(String crse){
        this.CRSE = crse;
    }

    //setter for OVERALLENR
    public void setOVERALLENR(int overallenr){
        this.OVERALLENR = overallenr;
    }

    //stter for OVERCAP
    public void setOVERALLCAP(int overallcap){
        this.OVERALLCAP = overallcap;
    }

    public List<Section> getOfferings() {
        return sections;
    }

    public void setOfferings(List<Section> sections) {
        this.sections = sections;
    }


}