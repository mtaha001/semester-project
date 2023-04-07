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
    private String OVERALLENR; //overall enrollment

    @CsvBindByName(column = "OVERALL CAP")
    private String OVERALLCAP; //overall capacity

    
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
    public String getOVERALLENR(){
        return OVERALLENR;
    }

    /**
     * getOVERALLCAP()
     * 
     * @return the OVERALLCAP
     */
    public String getOVERALLCAP(){
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
    public void setOVERALLENR(String overallenr){
        this.OVERALLENR = overallenr;
    }

    //stter for OVERCAP
    public void setOVERALLCAP(String overallcap){
        this.OVERALLCAP = overallcap;
    }

}