package edu.odu.cs.cs350.pne;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvBindByName;



public class Section {

    @CsvBindByName(column = "CRN")
    private String CRN;

    @CsvBindByName(column = "SUBJ")
    private String SUBJ;
    
}

