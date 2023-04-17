package edu.odu.cs.cs350.pne;

// import com.opencsv.bean.CsvBindByPosition;
// import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvBindByName;

public class Section {

    @CsvBindByName(column = "CRN")
    private int CRN;

    @CsvBindByName(column = "SUBJ")
    private String SUBJ;

     @CsvBindByName(column = "CRSE")
    private String CRSE;

    @CsvBindByName(column = "ENR")
    private int ENR;

    @CsvBindByName(column = "LINK")
    private String LINK;

    @CsvBindByName(column = "XLSTCAP")
    private int XLSTCAP;

    @CsvBindByName(column = "XLSTGROUP")
    private String XLSTGROUP;

    @CsvBindByName(column = "OVERALL CAP")
    private int OVERALLCAP;

    @CsvBindByName(column = "OVERALL ENR")
    private int OVERALLENR;

   

    /*
     * getCRN()
     * 
     * @return the CRN
     */
    public int getCRN() {
        return CRN;
    }


    /*
     * getSUBJ()
     * 
     * @return the subject
     */
    public String getSUBJ() {
        return SUBJ;
    }

    /*
     * getCRSE()
     * 
     * @return the course
     */
    public String getCRSE() {
        return CRSE;
    }


    /*
     * getENR()
     * 
     * @return enrolled
     */
    public int getENR() {
        return ENR;
    }
    
    /*
     * getLINK()
     * 
     * @return linked
     */
    public String getLINK() {
        return LINK;
    }

     /*
     * getXLSTCAP()
     * 
     * @return the crosslist cap
     */
    public int getXLSTCAP() {
        return XLSTCAP;
    }

    /*
     * getXLSTGROUP()
     * 
     * @return grouped crosslisted
     */
    public String getXLSTGROUP() {
        return XLSTGROUP;
    }
    
    /*
     * getOVERALLCAP()
     * 
     * @return overall capacity
     */
    public int getOVERALLCAP() {
        return OVERALLCAP;
    }
    
    /*
     * getOVERALLENR()
     * 
     * @return enrolled
     */
    public int getOVERALLENR() {
        return OVERALLENR;
    }
    
    //setter for CRN
    public void setCRN(int crn) {
        this.CRN = crn;
    }
    
    //setter for SUBJ
    public void setSUBJ(String subj) {
        this.SUBJ = subj;
    }

    //setter for CRSE 
    public void setCRSE(String crse){
        this.CRSE = crse;
    }

    //setter for ENR 
    public void setENR(int enr){
        this.ENR = enr;
    }

    //setter for XLSTCAP
    public void setXLSTCAP(int xlstcap){
        this.XLSTCAP = xlstcap;
    }

    //setter for XLSTGROUP
    public void setXLSTGROUP(String xlstgroup)
    {
        this.XLSTGROUP = xlstgroup;
    }

    public void setOVERALLCAP(int overallcap){
        this.OVERALLCAP = overallcap;
    }

    public void setOVERALLENR(int overallenr){
        this.OVERALLENR = overallenr;
    }
    

}

