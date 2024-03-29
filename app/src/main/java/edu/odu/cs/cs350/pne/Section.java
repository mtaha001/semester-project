package edu.odu.cs.cs350.pne;

// import com.opencsv.bean.CsvBindByPosition;
// import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvBindByName;

/**Represents a section of a course. */
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

   public Section(){
    CRN = 0;
    SUBJ = "";
    CRSE = "";
    ENR = 0;
    LINK = "";
    XLSTCAP = 0;
    XLSTGROUP = "";
    OVERALLCAP = 0;
    OVERALLENR = 0;

   }

    /**
     * getCRN()
     * retrieves a section's unique identifier
     * @return the CRN
     */
    public int getCRN() {
        return CRN;
    }


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
     * getXLSTCAP()
     * 
     * @return the crosslist cap
     */
    public int getXLSTCAP() {
        return XLSTCAP;
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
    
    /**set a section's CRN
     * @param crn the desired identifier of the section
     */
    public void setCRN(int crn) {
        this.CRN = crn;
    }
    
    /**set a section's Subject
     * @param subj the desired subject of the section
     */
    public void setSUBJ(String subj) {
        this.SUBJ = subj;
    }

    /**set a section's Course Number
     * @param crse the desired course number of the section
     */ 
    public void setCRSE(String crse){
        this.CRSE = crse;
    }

    /**set a section's enrollment numbers
     * @param enr the number of students enrolled in the section
     */
    public void setENR(int enr){
        this.ENR = enr;
    }

    /**set a section's cross-list cap
     * @param xlstcap the The maximum number of students that 
     * can enroll in this section
     */
    public void setXLSTCAP(int xlstcap){
        this.XLSTCAP = xlstcap;
    }

    /**set a section's cross-list group
     * @param xlstgroup the sections of a course that belongs to a 
     * single offering.
     */  
    public void setXLSTGROUP(String xlstgroup)
    {
        this.XLSTGROUP = xlstgroup;
    }

    /**
    * Sets the overall capacity of this Offering object to the specified integer value.
    * @param overallcap the integer value to be set as the overall capacity of this Offering object
    */
    public void setOVERALLCAP(int overallcap){
        this.OVERALLCAP = overallcap;
    }

    /**
    * Sets the overall enrollment of this Offering object to the specified integer value.
    * @param overallenr the integer value to be set as the overall enrollment of this Offering object
    */
    public void setOVERALLENR(int overallenr){
        this.OVERALLENR = overallenr;
    }
    

}

