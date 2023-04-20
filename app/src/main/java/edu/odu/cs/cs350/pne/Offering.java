package edu.odu.cs.cs350.pne;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvBindByName;
import java.util.ArrayList;


public class Offering {

    private ArrayList<Section> sections;

    @CsvBindByName(column = "INSTRUCTOR")
    private String INSTRUCTOR;

    @CsvBindByName(column = "CRSE")
    private String CRSE; //course
    
    @CsvBindByName(column = "OVERALL ENR")
    private int OVERALLENR; //overall enrollment

    @CsvBindByName(column = "OVERALL CAP")
    private int OVERALLCAP; //overall capacity

    private String courseName;

    private String section;


    
    public Offering(String courseName, String section, int overallCap, int overallEnrollment) {
        this.courseName = CRSE;
        this.section = section;
        this.OVERALLCAP = overallCap;
        this.OVERALLENR = overallEnrollment;
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
        return OVERALLENR;
    }

    /**
     * getOVERALLCAP()
     * 
     * @return the OVERALLCAP
     */
    public int getOVERALLCAP(){
        return OVERALLCAP;
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

}