package edu.odu.cs.cs350.pne;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvBindByName;



public class Offering {

    @CsvBindByName(column = "INSTRUCTOR")
    private String INSTRUCTOR;

    @CsvBindByName(column = "CRSE")
    private String CRSE; //course
    
    @CsvBindByName(column = "OVERALL ENR")
    private String OVERALLENR; //overall enrollment

    @CsvBindByName(column = "OVERALL CAP")
    private String OVERALLCAP; //overall capacity

}