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

    //generate a new workbook
    public static void main(String[] args){
        String filePath = "C:/path/to/projection_report.xlsx"; // specify the file path to save the Excel workbook

        // Create a new Excel workbook
        Workbook workbook = new XSSFWorkbook(); 

         // Save the workbook to the specified file path
        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
            System.out.println("Detailed Projection Report saved successfully to: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the workbook
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }    
    }



    
    

    
    
   
    



    




}


