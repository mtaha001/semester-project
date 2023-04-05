package edu.odu.cs.cs350.pne;


import java.io.Console;
import java.io.IOException;
import java.io.*;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DetailedProjectionReport {
    private InputStream fileIn;
    private FileOutputStream fileOut; 
    private String filePath; 
    private String newFilePath;

    // Default Constructor for DPR
    public DetailedProjectionReport()
    {
        this.filePath ="";
        
    }

    /**
     * getFilePath()
     * 
     * @return filePath 
     */
    public String getFilePath(){
        return filePath; 
    }

    //Set filepath
    public void setFilePath(String newFilePath){
        this.filePath = newFilePath;
    }

    

    
   
    



    




}
