package edu.odu.cs.cs350.pne;

// import com.opencsv.bean.CsvBindByPosition;
// import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvBindByName;

public class Section {

    //private String SUBJ;
    private String CRSE;
    private int XLSTCAP;
    private int ENR;
    //private String LINK;
    //private String XLSTGROUP;
    private int OVERALLCAP;
    private int OVERALLENR;
    //private int CRN;
    

    @CsvBindByName(column = "CRN")
    private String CRN;

    @CsvBindByName(column = "SUBJ")
    private String SUBJ;

    @CsvBindByName(column = "ENR")

    @CsvBindByName(column = "LINK")
    private String LINK;

    @CsvBindByName(column = "XLSTCAP")

    @CsvBindByName(column = "XLSTGROUP")
    private String XLSTGROUP;

    @CsvBindByName(column = "OVERALL CAP")

    @CsvBindByName(column = "OVERALL ENR")

    /**
     * getSUBJ()
     * 
     * @return the subject
     */
    public String getSUBJ() {
        return SUBJ;
    }

    /**
     * getCRSE()
     * 
     * @return the course
     */
    public String getCRSE() {
        return CRSE;
    }

    /**
     * getXLSTCAP()
     * 
     * @return the crosslist cap
     */
    public int getXLSTCAP() {
        return XLSTCAP;
    }

    /**
     * getENR()
     * 
     * @return enrolled
     */
    public int getENR() {
        return ENR;
    }
    
    /**
     * getLINK()
     * 
     * @return linked
     */
    public String getLINK() {
        return LINK;
    }

    /**
     * getXLSTGROUP()
     * 
     * @return grouped crosslisted
     */
    public String getXLSTGROUP() {
        return XLSTGROUP;
    }
    
    /**
     * getOVERALLCAP()
     * 
     * @return overall capacity
     */
    public int getOVERALLCAP() {
        return OVERALLCAP;
    }
    
    /**
     * getOVERALLENR()
     * 
     * @return enrolled
     */
    public int getOVERALLENR() {
        return OVERALLENR;
    }

    /**
     * getCRN()
     * 
     * @return the CRN
     */
    public int getCRN() {
        return CRN;
    }

}

