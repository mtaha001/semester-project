package edu.odu.cs.cs350.pne;

// import com.opencsv.bean.CsvBindByPosition;
// import com.opencsv.bean.CsvToBean;
// import com.opencsv.bean.CsvBindByName;

public class Section {

    private int CRN;
    private String SUBJ;
    private String CRSE;

    
    /**
     * getSUBJ()
     * 
     * @return the subject
     */
    public String getSUBJ() {
        return SUBJ;
    }

    /**
     * getCRN()
     * 
     * @return the CRN
     */
    public int getCRN() {
        return CRN;
    }

    /**
     * getCRSE()
     * 
     * @return the course
     */
    public String getCRSE() {
        return CRSE;
    }


}

